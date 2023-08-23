package chapter02;

public class Java03_Datatype_3 {
    public static void main(String[] args) {
        // TODO 引用数据类型
        String s = "123";

        String s1= """
                Hello
                    JAVA
                        ttk
                """;
        System.out.println(s1);

        // 不可变特性
        String s2 = "hello";
        String t = s2;
        s2 = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}
