package chapter02;

public class Java05_Array {
    public static void main(String[] args) {
        // TODO 数组
        // 初始化数组
        int[] ns = new int[5];
        System.out.println(ns.length);

        // 直接初始化数组
        int[] ns1 = new int[]{1, 2, 3, 4, 5};
        // 简写
        int[] ns2 = {1, 2, 3, 4, 5};


        // TODO 字符串数组
        String[] names = {
                "ABC", "XYZ", "ZOO"
        };
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

        // TODO 遍历数组
        for (int i = 0; i < 5; i++) {
            System.out.println("ns1_" + i + ":" + ns1[i]);
        }

        for (int i : ns2) {
            System.out.println("ns2_" + i + ":" + ns2[i]);
        }
    }
}
