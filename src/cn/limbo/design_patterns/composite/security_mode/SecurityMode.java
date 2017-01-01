package cn.limbo.design_patterns.composite.security_mode;

/**
 * 安全组合模式的基础容器的实现模式
 * 个人认为使用接口实现更加好一点，因为不需要提供默认的方法实现，只要实现了容器标准就可以
 * Created by limbo on 2016/12/2.
 */
public interface SecurityMode {

    public void inform();

}
