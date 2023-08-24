package chapter04;

public class Java07_Interface {
    // TODO 接口
    // 如果一个抽象类没有字段，所有方法全部都是抽象方法,就可以把该抽象类改写为接口：interface
    //  TODO 所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。
    // 因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）。
    interface Person {
        void run();
        String getName();
    }
    // TODO 当一个具体的class去实现一个interface时，需要使用implements关键字
    class Student implements Person {
        private String name;
        public Student(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println(this.name + " run");
        }
        @Override
        public String getName() {
            return this.name;
        }
    }

    // TODO 在Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface
    interface Hello {
        void run();
        String getName();
    }
    class Student2 implements Person, Hello {
        @Override
        public void run() {

        }
        @Override
        public String getName() {
            return null;
        } // 实现了两个interface
    }

}
