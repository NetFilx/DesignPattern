package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.NounNode;

/**
 * 数字节点
 * Created by dell on 2017/1/1.
 */
public class NumberNode implements NounNode {

    private Integer num;

    public NumberNode(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public void interpret(Context context) {

    }

    @Override
    public Object execute() {

         return num;

    }
}
