package chapter05;

import java.util.StringJoiner;

public class Java03_StringJoiner {
    public static void main(String[] args) {
        // TODO StringJoiner
        // 1. 用StringJoiner拼接字符串时，还可以额外附加一个“开头”和“结尾”。
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ");
        // var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names)
            sj.add(name);
        System.out.println(sj.toString());

        // 2. 用指定分隔符拼接字符串数组时，使用StringJoiner或者String.join()更方便；
        String[] names2 = {"Bob", "Alice", "Grace"};
        var s = String.join(", ", names2);
        System.out.println(s);
    }
}
