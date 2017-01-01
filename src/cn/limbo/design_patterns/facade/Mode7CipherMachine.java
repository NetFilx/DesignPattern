package cn.limbo.design_patterns.facade;

/**
 * 模7加密法
 * Created by limbo on 2016/12/1.
 */
public class Mode7CipherMachine implements CipherMachine {
    @Override
    public String doEncrypt(String plainText) {
        String result = "";

        char[] chars = plainText.toCharArray();

        System.out.println("正在加密...");
        //模7运算
        for (char ch : chars) {
            result += String.valueOf((ch % 7));
        }

        System.out.println("得到密文: " + result);
        //返回密文
        return result;
    }
}
