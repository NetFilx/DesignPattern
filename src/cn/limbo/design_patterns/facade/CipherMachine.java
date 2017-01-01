package cn.limbo.design_patterns.facade;

/**
 * 加密的标准
 * Created by limbo on 2016/12/1.
 */
public interface CipherMachine {

    //加密类的操作
    public String doEncrypt(String plainText);

}
