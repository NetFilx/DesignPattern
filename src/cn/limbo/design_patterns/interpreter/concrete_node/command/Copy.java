package cn.limbo.design_patterns.interpreter.concrete_node.command;

/**
 * Created by dell on 2017/1/6.
 */
public class Copy extends Command{

    @Override
    public String doChain(String text) {
        if(text.equalsIgnoreCase("copy")){
            return "复制";
        }
        //执行不了传递给下一个执行
        if(this.successor == null){
            return null;
        }
        else
            return this.successor.doChain(text);
    }

}
