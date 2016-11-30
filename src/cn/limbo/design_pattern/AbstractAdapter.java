package cn.limbo.design_pattern;

/**
 * 个人感觉的类适配器的第三种实现方式，抽象类的实现方式
 * 可以认为是缺省的适配器，预先定义一下方法，有选择的实现，从而可以定制出特殊的适配器
 * 用到这个类的时候只要有选择的实现就好了，用不到的方法就放着
 * Created by limbo on 2016/11/30.
 */
public abstract class AbstractAdapter{


    public void methodA() {

    }

    public int methodB() {
        return 0;
    }

    public String methodC() {
        return null;
    }

    public boolean methodD() {
        return false;
    }
}
