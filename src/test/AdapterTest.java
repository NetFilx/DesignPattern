package test;

import cn.limbo.design_pattern.Adapter;
import cn.limbo.design_pattern.ChineseCharger;
import cn.limbo.design_pattern.ChineseStandard;
import org.junit.Test;

/**
 * Created by limbo on 2016/11/30.
 */
public class AdapterTest {

    @Test
    public void show(){

        ChineseStandard chineseStandard = new ChineseCharger();
        Adapter adapter = new Adapter(chineseStandard);
        adapter.chargeByAmericanCharger();

    }

}
