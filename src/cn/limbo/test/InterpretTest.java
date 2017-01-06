package cn.limbo.test;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.Expression;
import cn.limbo.design_patterns.interpreter.concrete_node.CountExpression;
import cn.limbo.design_patterns.interpreter.concrete_node.DBExpression;
import cn.limbo.design_patterns.interpreter.concrete_node.command.Command;
import cn.limbo.design_patterns.interpreter.concrete_node.command.Copy;
import cn.limbo.design_patterns.interpreter.concrete_node.command.Move;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.Entity;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.Table;
import cn.limbo.design_patterns.interpreter.concrete_node.entity.View;
import org.junit.Test;

/**
 * Created by dell on 2017/1/1.
 */
public class InterpretTest {


    @Test
    public void show(){

        Context c = new Context(" ");
        String text = "1 + 2 + 3 + 4 - 5 + 6 - 7";
        Expression countExpress = new CountExpression(c.getStringTokenizer());
        c.setExpression(countExpress);
        c.add(text);
        c.execute();
    }

    @Test
    public void show2(){
        Context c = new Context(" ");
        String text1 = "COPY VIEW FROM srcDB TO desDB";
        String text2 = "MOVE TABLE Student FROM srcDB TO desDB";
        String text3 = "copy TABLE hhh FROM aDB TO bDB";
        DBExpression dbExpression = new DBExpression();

        //添加操作指令
        Command copy,move;
        copy = new Copy();
        move = new Move();
        dbExpression.add(copy);
        dbExpression.add(move);

        //添加实体
        Entity table,view;
        table = new Table();
        view = new View();
        dbExpression.add(table);
        dbExpression.add(view);

        c.setExpression(dbExpression);
        c.add(text1);
        c.add(text2);
        c.add(text3);
        c.execute();

    }

}
