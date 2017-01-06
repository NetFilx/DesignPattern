package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.OptionNode;
import cn.limbo.design_patterns.interpreter.concrete_node.command.Command;
import cn.limbo.design_patterns.interpreter.concrete_node.command.CommandChain;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.Entity;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.EntityChain;

import java.util.ArrayList;

/**
 * 数据库的指令，当前包括Copy，Move
 * Created by dell on 2017/1/6.
 */
public class DBOption implements OptionNode {

    private String option;       //操作，如Copy
    private String entity;       //实体，如TABLE，VIEW等
    private String entityName;   //实体的名称，如student之类的
    private CommandChain commandChain; //操作指令执行链
    private EntityChain entityChain;  //实体执行链

    public DBOption(){
        commandChain = new CommandChain();
        entityChain = new EntityChain();
    }

    @Override
    public void interpret(String text) {
        String[] words = text.split(" ");
        if (words.length < 2) {
            System.out.println("指令错误！");
        } else {
            option = words[0];
            entity = words[1];
            //如果存在具体的实体
            if (words.length > 2) {
                entityName = words[2];
            }else {
                entityName = "";
            }
        }
    }

    public void add(Command command) {
        commandChain.add(command);
    }

    public void add(Entity entity) {
        entityChain.add(entity);
    }

    @Override
    public void interpret(Context context) {

    }

    @Override
    //其实这里应该改成链式处理请求
    public String execute() {
        String result = "";
        result += commandChain.doChain(option) + entityChain.doChain(entity,entityName);
        if(entityName.equals("")){
            result += entityName;
        }
        return  result;
    }
}
