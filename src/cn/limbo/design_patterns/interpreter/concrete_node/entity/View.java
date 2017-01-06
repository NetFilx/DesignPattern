package cn.limbo.design_patterns.interpreter.concrete_node.entity;

/**
 * Created by dell on 2017/1/6.
 */
public class View extends Entity {
    @Override
    public String doChain(String text, String name) {
        if (text.equalsIgnoreCase("view")) {
            if (name.equals(""))
                return "所有视图";
            else
                return name + "视图";
        }
        //执行不了传递给下一个执行
        if(this.successor == null){
            return null;
        }
        else
            return this.successor.doChain(text,name);
    }
}
