package chapter03;

import java.util.Scanner;

public class Java02_IfJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt();
        // TODO if条件
        if (age>20)
            System.out.println(">20");
        else if (age > 10)
            System.out.println(">10<20");
        else System.out.println("<10");

        // TODO 浮点 利用差值小于某个临界值来判断
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }

        // TODO 判断string .equals()
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }
}
