package cn.limbo.test;

import cn.limbo.design_patterns.facade.Facade;
import cn.limbo.design_patterns.facade.ShiftCipherMachine;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/1.
 */
public class FacadeTest {

    @Test
    public void show(){
        Facade facade = new Facade(new ShiftCipherMachine(10));
        facade.doEncrypt("input.txt","output.txt");
    }

}
