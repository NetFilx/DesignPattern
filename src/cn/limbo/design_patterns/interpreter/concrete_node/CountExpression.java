package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.abstract_node.Expression;
import cn.limbo.design_patterns.interpreter.abstract_node.Node;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 计算指令表达式
 * Created by dell on 2017/1/1.
 */
public class CountExpression implements Expression {

    private String token;
    private String text;
    private ArrayList<Node> nodes;
    private Stack stack;

    public CountExpression(String token) {
        this.token = token;
        nodes = new ArrayList<>();
        stack = new Stack();
    }


    public void setText(String text) {
        this.text = text;
    }

    //分割指令
    @Override
    public void interpret() {
        String[] words = this.text.split(token);
        for (int i = 0; i < words.length; i++) {
            //遇见空格则返回
            if (words[i].equals(" ")) {
                continue;
            }
            //如果是操作性的指令
            if (words[i].equals("+")) {
                nodes.add(new CountNode(words[i]));
            } else if (words[i].equals("-")) {
                nodes.add(new CountNode("+"));
                //将减后面的变为相反数
                words[i+1] = "-" + words[i+1];
            } else {
                nodes.add(new NumberNode(Integer.parseInt(words[i])));
            }
        }
    }

    //解释执行语句
    public void execute() {
        if (nodes.get(0) instanceof CountNode) {
            System.out.println("输入错误");
            return;
        }

        //保存当前的操作节点，
        CountNode curCountNode = null;
        //保存头节点
        CountNode headCountNode = null;
        for (Node node : nodes) {
            //数字节点压入栈
            if (node instanceof NumberNode) {
                stack.push(node);
            }

            if (node instanceof CountNode) {
                //设置头节点
                if (headCountNode == null) {
                    headCountNode = (CountNode) node;
                }

                //如果当前结点为空的话，说明为头节点，没有上一层节点
                if (curCountNode == null) {
                    curCountNode = (CountNode) node;
                    curCountNode.setLeft((NumberNode) stack.pop());
                }
                //如果不是头节点
                else {
                    //设置左节点
                    ((CountNode) node).setLeft((NumberNode) stack.pop());
                    //将当前结点设为上一层节点的右节点
                    curCountNode.setRight(node);
                    curCountNode = (CountNode) node;
                }
            }
        }
        //将栈中最后一个元素设置到上一个操作节点的右节点
        if (stack.size() != 0) {
            curCountNode.setRight((Node) stack.pop());
        } else {
            System.out.println("输入的表达式有误！");
            return;
        }
        System.out.println(headCountNode.execute());
    }

}
