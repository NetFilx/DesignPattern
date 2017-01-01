package cn.limbo.design_patterns.interpreter.abstract_node;

/**
 * 抽象表达式
 * Created by dell on 2017/1/1.
 */
public interface Expression {

    public void execute();
    public void setText(String text);
}
