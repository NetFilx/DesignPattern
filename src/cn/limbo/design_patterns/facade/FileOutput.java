package cn.limbo.design_patterns.facade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 将密码写入到文件中
 * 单一职责原则
 * Created by limbo on 2016/12/1.
 */
public class FileOutput {

    /**
     * 将密文写入到文件中
     *
     * @param cipher   密文
     * @param filePath 密文存储路径
     */
    public static void write(String cipher, String filePath) {

        File file = null;
        FileWriter writer = null;
        try {
            file = isExist(filePath);
            writer = new FileWriter(file);
            System.out.println("写入文件,保存密文");
            writer.write(cipher);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 判断文件是否存在，存在则返回文件本省，不存在则新建文件
     *
     * @param filePath 文件路径
     * @return 已存在的文件或者是新建的文件
     */
    private static File isExist(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        return file;
    }

}
