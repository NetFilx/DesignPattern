package cn.limbo.design_patterns.facade;

/**
 * 移位加密法
 * Created by limbo on 2016/12/1.
 */
public class ShiftCipherMachine implements CipherMachine {

    //偏移量
    private int shift;

    public ShiftCipherMachine(int shift) {
        this.shift = shift;
    }

    @Override
    public String doEncrypt(String plainText) {
        String result = "";
        char[] chars = plainText.toCharArray();

        int temp = 0;

        System.out.println("正在加密...");
        for (char c : chars) {
            temp = (int) c;

            //小写字母移位
            if (c >= 'a' && c <= 'z') {
                temp += shift % 26;
                if (temp > 122)
                    temp -= 26;
                if (temp < 97)
                    temp += 26;
            }

            //大写字母移位
            if (c >= 'A' && c <= 'Z') {
                temp += shift % 26;
                if (temp > 90)
                    temp -= 26;
                if (temp < 65)
                    temp += 26;
            }
            result += (char) temp;
        }
        System.out.println("得到密文: " + result);
        return result;
    }

}
