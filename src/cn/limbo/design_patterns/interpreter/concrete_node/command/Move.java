package cn.limbo.design_patterns.interpreter.concrete_node.command;

/**
 * Created by dell on 2017/1/6.
 */
public class Move extends Command {
    @Override
    public String doChain(String text) {
        if(text.equalsIgnoreCase("move")){
            return "移动";
        }
        if(this.successor == null){
            return null;
        }
        else
            return this.successor.doChain(text);
    }
}
