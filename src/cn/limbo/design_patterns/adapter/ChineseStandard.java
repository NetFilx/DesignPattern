package cn.limbo.design_patterns.adapter;

/**
 * 举例实现适配器模式，中国的标准和美国的标准有些许不同，就比如说电源充电器，中国一般都是三脚的
 * 美国都是两脚的，要让中国的充电器能在美国正常工作就需要一个电源适配器，该适配器需要符合美国标
 * 准，同时也要使中国充电器工作起来，即提供一个中国充电器可以正常工作的环境
 * 该标准及其子类即为源标准，整个实验需求就是将源标准转换为目标标准
 * <p>
 * Created by limbo on 2016/11/30.
 */
public interface ChineseStandard {

    public void chargeByChineseCharger();

}
