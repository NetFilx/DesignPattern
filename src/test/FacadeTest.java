package test;

import cn.limbo.facade.Facade;
import cn.limbo.facade.Mode7CipherMachine;
import cn.limbo.facade.ShiftEncryption;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/1.
 */
public class FacadeTest {

    @Test
    public void show(){
        Facade facade = new Facade(new ShiftEncryption(10));
        facade.doEncrypt("input.txt","output.txt");
    }

}
