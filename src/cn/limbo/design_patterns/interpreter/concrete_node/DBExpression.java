package cn.limbo.design_patterns.interpreter.concrete_node;

import cn.limbo.design_patterns.interpreter.abstract_node.Expression;
import cn.limbo.design_patterns.interpreter.concrete_node.command.Command;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.Entity;

/**
 * 具体表达式处理类，用于处理当前环境中的数据库指令
 * Created by dell on 2017/1/1.
 */
public class DBExpression implements Expression{

    private String text; //待处理的指令
    private DBOption dbOption; //处理操作指令
    private DBDatabase dbDatabase; //处理表的关系

    public DBExpression() {
        dbOption = new DBOption();
        dbDatabase = new DBDatabase();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void interpret(){
        text = text.toLowerCase();
        String[] words = text.split("from");
        //解释操作性指令
        dbOption.interpret(words[0]);
        //解释库关系
        dbDatabase.interpret(words[1]);
    }

    public void add(Command command){
        dbOption.add(command);
    }

    public void add(Entity entity){
        dbOption.add(entity);
    }

    @Override
    public void execute() {
        //执行
        System.out.println(dbDatabase.execute() + dbOption.execute());
    }

}
