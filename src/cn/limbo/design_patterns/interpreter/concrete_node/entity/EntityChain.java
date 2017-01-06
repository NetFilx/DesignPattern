package cn.limbo.design_patterns.interpreter.concrete_node.entity;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/1/6.
 */
public class EntityChain {


    private Entity headEntity; //头指令
    private Entity curEntity; // 当前的指令，方便之后添加数据
    private Map<Object,Integer> maps; //用于保存当前指令集合中已有的指令，使重复添加指令失效

    public EntityChain() {
        maps = new HashMap<>();
    }

    public void add(Entity e) {
        //头指令为空的时候
        if(headEntity == null){
            headEntity = e;   //头指令赋值
            maps.put(e.getClass(),1);
            curEntity = e;   //当前指令复制
        }else {
            //存在相同类型的指令
            if(maps.get(e.getClass()) == null){
                maps.put(e.getClass(),1);
                curEntity.setSuccessor(e);
                curEntity = e;
                System.out.println();
            }
        }

    }

    public String doChain(String text,String name) {
        //从头指令开始执行
        return headEntity.doChain(text,name);
    }

}
