package cn.limbo.test;

import cn.limbo.design_patterns.adapter.object_adapter.ObjectAdapter;
import cn.limbo.design_patterns.adapter.ChineseCharger;
import cn.limbo.design_patterns.adapter.ChineseStandard;
import org.junit.Test;

/**
 * Created by limbo on 2016/11/30.
 */
public class AdapterTest {

    @Test
    public void show(){

        ChineseStandard chineseStandard = new ChineseCharger();
        ObjectAdapter adapter = new ObjectAdapter(chineseStandard);
        adapter.chargeByAmericanCharger();

    }

}
