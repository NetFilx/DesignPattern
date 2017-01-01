package cn.limbo.design_patterns.adapter;

/**
 * 中国充电器，实现的是中国的标准，作为带到美国去的充电器，也就是实验中的源标准子类
 * Created by limbo on 2016/11/30.
 */
public class ChineseCharger implements ChineseStandard {
    @Override
    public void chargeByChineseCharger() {
        System.out.println("中国充电器正在工作");
    }
}
