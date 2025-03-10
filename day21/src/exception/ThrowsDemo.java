package exception;


import javax.imageio.IIOException;
import java.io.*;
import java.io.IOException;

public class ThrowsDemo {
    public static void doCope() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("o1.png");
        FileOutputStream fos = new FileOutputStream("is.png");
        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        fos.write(buf);
        fis.close();
        fos.close();
        System.out.println("copy ok");

    }
    public static void main(String[] args) throws Exception {
        doCope();
    }
    public static Integer doConvert(String str) throws  Exception{
        return Integer.parseInt(str);
    }
}