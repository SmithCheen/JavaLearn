package chapter05;

import java.math.BigInteger;

public class Java08_BigInterger {
    public static void main(String[] args) {
        // TODO BigInteger
        // BigInteger用于表示任意大小的整数；
        // BigInteger是不变类，并且继承自Number；
        // 将BigInteger转换成基本类型时可使用longValueExact()等方法保证结果准确。
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000

        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780


    }

}
