package chapter04;

public class Java04_Polymorphic {
    public static void main(String[] args) {
        // TODO 多态 Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型
        Person4 p = new Student4();
        p.run(); // Student.run

        // TODO 多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法

    }
}
class Person4 {
    public void run() {
        System.out.println("Person.run");
    }
}

class Student4 extends Person4 {
    // TODO 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）
    // Override和Overload不同的是，如果方法签名不同，就是Overload,Overload方法是一个新方法；
    // 如果方法签名相同，并且返回值也相同，就是Override。
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}