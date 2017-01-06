package cn.limbo.design_patterns.interpreter.concrete_node.entity;

/**
 * Created by dell on 2017/1/6.
 */
public abstract class Entity {

    //后继者
    protected Entity successor;

    public void setSuccessor(Entity successor) {
        this.successor = successor;
    }

    //执行
    public abstract String doChain(String text,String name);

}
