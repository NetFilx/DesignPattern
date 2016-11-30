package cn.limbo.design_pattern;

/**
 * 电源适配器，即为中国的充电器提供一个可以在美国那里可以正常工作的环境，因为本身就需要可以在美国
 * 工作，即本身应该符合美国的标准
 * Created by limbo on 2016/11/30.
 */
public class Adapter implements AmericanStandard{

    //采用组合方式，将符合中国标准的充电器组合经来，如果不能理解的话可以看看电源适配器的原理和样子
    private ChineseStandard chineseStandard;

    public Adapter(ChineseStandard chineseStandard) {
        this.chineseStandard = chineseStandard;
    }

    @Override
    /**
     * 该方法只是提供了一个中国充电器能在美国充电的环境
     */
    public void chargeByAmericanCharger() {
        //使用实现中国标准的充电器进行充电
        this.chineseStandard.chargeByChineseCharger();
    }
}
