package chapter05;

import java.util.Arrays;

public class Java01_String {
    public static void main(String[] args) {
        // TODO String 引用类型 不可变
        String s = "Hello";
        System.out.println(s); // "Hello"
        s = s.toUpperCase();
        System.out.println(s); // "HELLO"

        // TODO 字符串比较 equals()
        // 当我们想要比较两个字符串是否相同时，要特别注意，我们实际上是想比较字符串的内容是否相同。必须使用equals()方法而不能用==。
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); // "true"
        System.out.println(s1.equals(s2)); // "true"
        // 从表面上看，两个字符串用==和equals()比较都为true，
        // 但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。
        // 这种==比较返回true纯属巧合。换一种写法，==比较就会失败
        s1 = "hello";
        s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2); // "false"
        System.out.println(s1.equals(s2)); // "true"
        // TODO 要忽略大小写比较，使用equalsIgnoreCase()

        // TODO 搜索/提取子串
        "Hello".contains("ll"); // true
        // 注意到contains()方法的参数是CharSequence而不是String，因为CharSequence是String实现的一个接口。
        // 搜索子串的更多的例子：
        "Hello".indexOf("l"); // 2
        "Hello".lastIndexOf("l"); // 3
        "Hello".startsWith("He"); // true
        "Hello".endsWith("lo"); // true
        //提取子串的例子：
        "Hello".substring(2); // "llo"
        "Hello".substring(2, 4); // "ll"

        // TODO 去除首尾空白字符
        // 1. 使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n：
        "  \tHello\r\n ".trim(); // "Hello"
        // 注:trim()并没有改变字符串的内容，而是返回了一个新字符串。
        // 2. 另一个strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
        "\u3000Hello\u3000".strip(); // "Hello"
        " Hello ".stripLeading(); // "Hello "
        " Hello ".stripTrailing(); // " Hello"
        // 3. String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：
        "".isEmpty(); // true，因为字符串长度为0
        "  ".isEmpty(); // false，因为字符串长度不为0
        "  \n".isBlank(); // true，因为只包含空白字符
        " Hello ".isBlank(); // false，因为包含非空白字符

        // TODO 替换子串
        // 1. 要在字符串中替换子串，有两种方法。一种是根据字符或字符串替换：
        s = "hello";
        s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        // 2. 另一种是通过正则表达式替换：
        s = "A,,B;C ,D";
        s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
        // 上面的代码通过正则表达式，把匹配的子串统一替换为","。

        // TODO 分割字符串
        // 要分割字符串，使用split()方法，并且传入的也是正则表达式：
        s = "A,B,C,D";
        String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}

        // TODO 拼接字符串
        //拼接字符串使用静态方法join()，它用指定的字符串连接字符串数组：
        String[] arr = {"A", "B", "C"};
        s = String.join("***", arr); // "A***B***C"

        // TODO 格式化字符串
        // 字符串提供了formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串
        s = "Hi %s, your score is %d!";
        System.out.println(s.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
        // 常用的占位符有：
        //%s：显示字符串；
        //%d：显示整数；
        //%x：显示十六进制整数；
        //%f：显示浮点数。

        // TODO 类型转换
        // 1. 要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法：
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c
        // 2. 要把字符串转换为其他类型，就需要根据情况。例如，把字符串转换为int类型：
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        // 3. 把字符串转换为boolean类型：
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        // 4. 要特别注意，Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：
        //Integer.getInteger("java.version"); // 版本号，11

        // TODO 转换为char[]
        // 1. String和char[]类型可以互相转换，方法是：
        char[] cs = "Hello".toCharArray(); // String -> char[]
        s = new String(cs); // char[] -> String
        // 2. 如果修改了char[]数组，String并不会改变：
        cs = "Hello".toCharArray();
        s = new String(cs);
        System.out.println(s);
        cs[0] = 'X';
        System.out.println(s);
        // 这是因为通过new String(char[])创建新的String实例时，它并不会直接引用传入的char[]数组，而是会复制一份，
        // 所以，修改外部的char[]数组不会影响String实例内部的char[]数组，因为这是两个不同的数组。
        // 从String的不变性设计可以看出，如果传入的对象有可能改变，我们需要复制而不是直接引用。

        int[] scores = new int[] { 88, 77, 51, 66 };
        Score sss = new Score(scores);
        sss.printScores();
        scores[2] = 99; // 外部代码修改
        sss.printScores();

        // TODO 字符编码 "UTF-8"
    }
}
class Score {
    private int[] scores;

    public Score(int[] scores) {
        // this.scores = scores; // 外部代码改变了实例字段
        this.scores = Arrays.copyOf(scores, scores.length); // TODO copyOf方法,外部代码不改变实例字段
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
