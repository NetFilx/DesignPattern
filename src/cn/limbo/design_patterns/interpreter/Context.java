package cn.limbo.design_patterns.interpreter;

import cn.limbo.design_patterns.interpreter.abstract_node.Expression;

import java.util.ArrayList;

/**
 * 整个指令系统的环境，做一些规范性的处理
 * Created by dell on 2017/1/1.
 */
public class Context {

    private String StringTokenizer;  //语句的分割符
    private ArrayList<String> texts; //当前环境中所要执行的语句集合
    private Expression expression;


    public Context(String stringTokenizer) {
        this.StringTokenizer = stringTokenizer;
        texts = new ArrayList<>();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getStringTokenizer() {
        return StringTokenizer;
    }

    //添加一条指令到指令集和中
    public void add(String text){
        this.texts.add(text);
    }

    public void execute(){
        for(String t : texts){
            expression.setText(t);
            expression.interpret();
            expression.execute();
        }
    }
}
