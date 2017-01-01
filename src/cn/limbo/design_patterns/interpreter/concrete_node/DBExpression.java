package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.abstract_node.Expression;

/**
 * 具体表达式处理类，用于处理当前环境中的数据库指令
 * Created by dell on 2017/1/1.
 */
public class DBExpression implements Expression{

    private String text; //待处理的指令
    private String token; //指令分隔符

    public DBExpression(String token) {
        this.token = token;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void split(){
        String[] nodes = text.split(token);


    }

    @Override
    public void execute() {

    }
}
