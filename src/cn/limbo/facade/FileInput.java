package cn.limbo.facade;

import java.io.*;

/**
 * 实现从文件中读取明文
 * 单一职责原则
 * Created by limbo on 2016/12/1.
 */
public class FileInput {

    /**
     * 从文件中读入
     *
     * @param filePath 文件全路径
     * @return 文件内容
     */
    public static String read(String filePath) {
        File file = null;
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            file = isExist(filePath);
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读入明文: " + sb.toString());
        return sb.toString();
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
