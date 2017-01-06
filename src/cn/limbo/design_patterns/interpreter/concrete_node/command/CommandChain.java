package cn.limbo.design_patterns.interpreter.concrete_node.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 命令链
 * Created by dell on 2017/1/6.
 */
public class CommandChain {

    private Command headCommand; //头指令
    private Command curCommand; // 当前的指令，方便之后添加数据
    private Map<Object,Integer> maps; //用于保存当前指令集合中已有的指令，使重复添加指令失效

    public CommandChain() {
        maps = new HashMap<>();
    }

    public void add(Command c) {
        //头指令为空的时候
        if(headCommand == null){
            headCommand = c;   //头指令赋值
            maps.put(c.getClass(),1);
            curCommand = c;   //当前指令复制
        }else {
            //存在相同类型的指令
            if(maps.get(c.getClass()) == null){
                maps.put(c.getClass(),1);
                curCommand.setSuccessor(c);
                curCommand = c;
            }
        }

    }

    public String doChain(String text) {
        //从头指令开始执行
        return headCommand.doChain(text);
    }
}
