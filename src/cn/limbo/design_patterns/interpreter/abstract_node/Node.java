package cn.limbo.design_patterns.interpreter.abstract_node;

import cn.limbo.design_patterns.interpreter.Context;

/**
 * 抽象节点类
 * Created by dell on 2017/1/1.
 */
public interface Node {

    public void interpret(Context context); //声明一个方法用于解释语句
    public Object execute();  //声明一个方法用于执行标记对应的命令

}
