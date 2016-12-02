package cn.limbo.design_patterns.adapter.class_adapter;

import cn.limbo.design_patterns.adapter.AmericanStandard;
import cn.limbo.design_patterns.adapter.ChineseCharger;

/**
 * 电源适配器，即为中国的充电器提供一个可以在美国那里可以正常工作的环境，因为本身就需要可以在美国
 * 工作，即本身应该符合美国的标准
 * 实现方式 类适配器
 * Created by limbo on 2016/11/30.
 */
public class ClassAdapter extends ChineseCharger implements AmericanStandard {

    //采用继承的方式实现适配器模式
    @Override
    public void chargeByAmericanCharger() {
        //直接调用父类的方法，实现方法
        chargeByChineseCharger();
    }
}
