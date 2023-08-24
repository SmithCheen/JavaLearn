package chapter04;

public class Java06_Abstract {
    public static void main(String[] args) {
//        Person p = new Student();
//        p.run();
    }
    // TODO abstract抽象方法
    // 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法

    // TODO 抽象方法实际上相当于定义了“规范”
    // 抽象类本身被设计成只能用于被继承，因此，抽象类可以强迫子类实现其定义的抽象方法

    // Person类定义了抽象方法run()，那么，在实现子类Student的时候，就必须覆写run()
    abstract class Person {
        public abstract void run();
    }

    class Student extends Person {
        @Override
        public void run() {
            System.out.println("Student.run");
        }
    }
}
