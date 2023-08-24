package package_test;

public class Person {
    // 位于同一个包的类，可以访问包作用域的字段和方法。不用public、protected、private修饰的字段和方法就是包作用域。
    // TODO 包作用域:
    void hello() {
        System.out.println("Hello");
    }
}
