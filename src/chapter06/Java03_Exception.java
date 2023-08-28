package chapter06;

public class Java03_Exception {
    public static void main(String[] args) {

        // TODO 抛出异常

        // TODO 异常的传播
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void process1() {
        process2();
    }

    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }

    // TODO 通过printStackTrace()可以打印出方法的调用栈
    /*
    java.lang.NumberFormatException: Cannot parse null string
	at java.base/java.lang.Integer.parseInt(Integer.java:630)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at chapter06.Java03_Exception.process2(Java03_Exception.java:19)
	at chapter06.Java03_Exception.process1(Java03_Exception.java:15)
	at chapter06.Java03_Exception.main(Java03_Exception.java:8
     */
    /*
    printStackTrace()对于调试错误非常有用，上述信息表示：NumberFormatException是在java.lang.Integer.parseInt方法中被抛出的，从下往上看，调用层次依次是：
        1. main()调用process1()；
        2. process1()调用process2()；
        3. process2()调用Integer.parseInt(String)；
        4. Integer.parseInt(String)调用Integer.parseInt(String, int)。

     查看Integer.java源码可知，抛出异常的方法代码如下：
     public static int parseInt(String s, int radix) throws NumberFormatException {
        if (s == null) {
        throw new NumberFormatException("Cannot parse null string");
        }
      ...
      }
      并且，每层调用均给出了源代码的行号，可直接定位。
     */


}
