package cn.limbo.design_patterns.composite.transparent_mode;

/**
 * 透明组合模式下的基础容器定义
 * 定义为抽象类的原因是为了提供一些缺省的方法实现
 * Created by limbo on 2016/12/2.
 */
public abstract class TransparentMode {

    //添加
    public void add(TransparentMode transparentMode) {
        System.out.println("对不起，不支持该方法...");
    }

    //移除
    public void remove(TransparentMode transparentMode) {
        System.out.println("对不起，不支持该方法...");
    }

    public TransparentMode getChild(int i) {
        System.out.println("对不起，不支持该方法...");
        return null;
    }

    public abstract void infrom();

}
