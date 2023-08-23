package chapter02;

public class Java03_Datatype_2 {
    public static void main(String[] args) {
        // TODO 数据类型转换
        // 小到大，自动转化
        byte b = 8;
        short s = b;
        int i = s;
        long lon = i;

        float f = lon;
        double d = f;

        // 大到小，强制转换
        int num = 100;
        byte by = (byte) num;



    }
}
