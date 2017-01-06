package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.Node;

/**
 * 解释表与表之间的移动
 * Created by dell on 2017/1/6.
 */
public class DBDatabase {

    private String srcDB;  //源库
    private String destDB; //目的库


    public void interpret(String text) {
        String[] words = text.split(" ");
        srcDB = words[1];
        destDB = words[3];
    }


    public String execute() {
        return "从 " + srcDB + " 库" + "到 " + destDB + " 库";
    }
}
