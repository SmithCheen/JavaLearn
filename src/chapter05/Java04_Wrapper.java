package chapter05;

public class Java04_Wrapper {
    public static void main(String[] args) {
        // TODO 包装类型
        // 1. Java核心库提供的包装类型可以把基本类型包装为class；
        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());

        // TODO Auto Boxing
        // 2. 自动装箱和自动拆箱都是在编译期完成的（JDK>=1.5）；
        Integer n = 100; // 编译器自动使用Integer.valueOf(int)
        int x = n; // 编译器自动使用Integer.intValue()
        //3. 装箱和拆箱会影响执行效率，且拆箱时可能发生NullPointerException；
        Integer nn = null;
        int ii = nn;

        // TODO 不变类
        // 4. 包装类型的比较必须使用equals()；
        // 我们把能创建“新”对象的静态方法称为静态工厂方法。Integer.valueOf()就是静态工厂方法，它尽可能地返回缓存的实例以节省内存。

        // TODO 进制转换
        // 5. 整数和浮点数的包装类型都继承自Number；
        int x1 = Integer.parseInt("100"); // 100
        int x2 = Integer.parseInt("100", 16); // 256,因为按16进制解析
        System.out.println(Integer.toString(100)); // "100",表示为10进制
        System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
        System.out.println(Integer.toHexString(100)); // "64",表示为16进制
        System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
        System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制

        // TODO 包装类型提供了大量实用方法。
        // boolean只有两个值true/false，其包装类型只需要引用Boolean提供的静态字段:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // int可表示的最大/最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long类型占用的bit和byte数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)

        // 最后，所有的整数和浮点数的包装类型都继承自Number，因此，可以非常方便地直接通过包装类型获取各种基本类型：
        // 向上转型为Number:
        Number num = Integer.valueOf(100);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int nnn = num.intValue();
        long ln = num.longValue();
        float fff = num.floatValue();
        double d = num.doubleValue();

        // TODO 处理无符号整型
        // 在Java中，并没有无符号整型（Unsigned）的基本数据类型。byte、short、int和long都是带符号整型，最高位是符号位。
        // 而C语言则提供了CPU支持的全部数据类型，包括无符号整型。无符号整型和有符号整型的转换在Java中就需要借助包装类型的静态方法完成。
        // 例如，byte是有符号整型，范围是-128~+127，但如果把byte看作无符号整型，它的范围就是0~255。
        // 我们把一个负的byte按无符号整型转换为int：
        byte xx = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(xx)); // 255
        System.out.println(Byte.toUnsignedInt(y)); // 127
        // 因为byte的-1的二进制表示是11111111，以无符号整型转换后的int就是255。
        // 类似的，可以把一个short按unsigned转换为int，把一个int按unsigned转换为long
    }

}
