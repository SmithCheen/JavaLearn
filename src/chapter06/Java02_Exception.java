package chapter06;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Java02_Exception {
    public static void main(String[] args) {

        // TODO 捕获异常

        // TODO 多catch语句 子类必须写在前面
        // 可以使用多个catch语句，每个catch分别捕获对应的Exception及其子类。
        // JVM在捕获到异常后，会从上到下匹配catch语句，匹配到某个catch后，执行catch代码块，然后不再继续匹配。

        // TODO finally语句 保证有无错误都会执行
        // finally语句不是必须的，可写可不写；
        // finally总是最后执行。

        // TODO 捕获多种异常
        // 如果某些异常的处理逻辑相同，但是异常本身不存在继承关系，那么就得编写多条catch子句：
        /*
         try {
            process1();
            process2();
            process3();
        } catch (NumberFormatException e) {
            System.out.println("Bad input");
        } catch (IOException e) {
            System.out.println("Bad input");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
         */

        // 因为处理IOException和NumberFormatException的代码是相同的，所以我们可以把它两用|合并到一起：
        /*
        try {
            process1();
            process2();
            process3();
        } catch (IOException | NumberFormatException e) { // IOException或NumberFormatException
            System.out.println("Bad input");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
         */

    }

    private static void process3() {
    }

    private static void process2() {
    }

    private static void process1() {
    }

}
