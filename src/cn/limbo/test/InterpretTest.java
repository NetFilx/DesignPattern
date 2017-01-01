package cn.limbo.test;

import cn.limbo.design_patterns.interpreter.Context;
import cn.limbo.design_patterns.interpreter.abstract_node.Expression;
import cn.limbo.design_patterns.interpreter.concrete_node.CountExpression;
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

}
