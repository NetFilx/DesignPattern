package cn.limbo.facade;

/**
 * 外观类，说明如下：
 * 实现一个加密模块 该模块由从文件中读取，加密文件内容，将加密内容输出三个部分组成
 * Created by limbo on 2016/12/1.
 */
public class Facade {

    //对于加密的方式有很多选择，所以这里主要使用一个加密机的子类，从而实现可以灵活配置的优点
    private CipherMachine cipherMachine;

    public Facade(CipherMachine cipherMachine) {
        this.cipherMachine = cipherMachine;
    }

    public void doEncrypt(String inputFilePath, String outputFilePath){
        String plainText = FileInput.read(inputFilePath);
        String cipher = cipherMachine.doEncrypt(plainText);
        FileOutput.write(cipher,outputFilePath);
    }

}
