package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.Node;
import cn.limbo.design_patterns.interpreter.abstract_node.OptionNode;

/**
 * 计算节点
 * Created by dell on 2017/1/1.
 */
public class CountNode implements Node {

    private String text; //操作符的内容
    private NumberNode left; //左边的数
    private Node right; //右边的操作或者数

    public CountNode(String node) {
        this.text = node;
    }

    public void setLeft(NumberNode left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    @Override
    public void interpret(Context context) {

    }

    @Override
    public Object execute() {

        //如果右节点是计数节点，则递归执行
        if (text.equals("+")) {
            return left.getNum() + (Integer) right.execute();
        }
        if (text.equals("-")) {
            return left.getNum() - (Integer) right.execute();
        }
        return null;

    }
}
