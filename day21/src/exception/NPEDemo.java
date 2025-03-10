package exception;

/**
 * 空指针异常
 * NullPointException
 */
public class NPEDemo {
    static String content;
    public static String doConvert(String content) {
        if(content == null) {
            System.out.println("content不能为空");
            //运行是异常,编译过程中检测不到
            throw new IllegalArgumentException("发生空指针异常");
        }
        System.out.println(content.toLowerCase());
        return "程序正常结束";
    }
    public static void main(String[] args) {
        doConvert(content);
        System.out.println("after");
    }
}
