package Day07;

import java.io.*;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/26
 **/

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("D:\\wuwu\\wuwu.png");
        InputStream is = new FileInputStream(inputFile);
        byte[] b = new byte[(int) inputFile.length()];
        is.read(b);
        File outputFile = new File("D:\\wuwu\\wuwu11.png");
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }

}
