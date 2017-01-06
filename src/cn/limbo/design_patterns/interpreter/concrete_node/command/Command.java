package cn.limbo.design_patterns.interpreter.concrete_node.command;

/**
 * Created by dell on 2017/1/6.
 */
public abstract class Command {

    //后继者
    protected Command successor;

    public void setSuccessor(Command successor) {
        this.successor = successor;
    }

    //执行
    public abstract String doChain(String text);

}
