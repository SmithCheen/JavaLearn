package chapter05;

import java.math.BigDecimal;

public class Java09_BigDecimal {
    public static void main(String[] args) {
        // TODO BigDecimal
        // BigDecimal用于表示精确的小数，常用于财务计算；
        // 比较BigDecimal的值是否相等，必须使用compareTo()而不能使用equals()
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd));

        // BigDecimal用scale()表示小数位数，例如：
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale()); // 2,两位小数
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0
    }

}
