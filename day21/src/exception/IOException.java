package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class IOException extends Throwable {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("text.txt",true);
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(java.io.IOException e) {
            System.out.println("写数据或关闭流出现了问题" + e.getMessage());
        }


    }
    public static void main1(String[] args)throws java.io.IOException {
        FileOutputStream fos = new FileOutputStream("text.txt",true);
        fos.write("hell0".getBytes(StandardCharsets.UTF_8));
        System.out.println("写入成功");
        fos.close();
    }
}
