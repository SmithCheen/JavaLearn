package chapter04;

public class Java03_Extends {
    public static void main(String[] args) {
        // TODO extend继承
        // 在OOP的术语中，我们把Person称为超类（super class），父类（parent class），基类（base class）
        // 把Student称为子类（subclass），扩展类（extended class）

        // TODO 继承数
        // Java只允许一个class继承自一个类

        // TODO protected字段
        // 子类无法访问父类的private字段或者private方法
        class Person {
            protected String name;
            protected int age;
        }
        class Student extends Person {
            public String hello() {
                return "Hello, " + name; // OK!
            }
        }

        // TODO super超类
        // super关键字表示父类（超类）。子类引用父类的字段时，可以用super.fieldName
        // 如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法
        // 子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
        class Person2 {
            protected String name;
            protected int age;
            public Person2(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        class Student2 extends Person2 {
            protected int score;
            public Student2(String name, int age, int score) {
                super(name, age); // 调用父类的构造方法Person(String, int)
                this.score = score;
            }
        }

        // TODO 阻止继承

        // TODO 向上转型
        // 把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）
        // 向上转型实际上是把一个子类型安全地变为更加抽象的父类型

        // TODO 向下转型
        // 子类功能比父类多，多的功能无法凭空变出来
        Person p1 = new Student(); // upcasting, ok
        Person p2 = new Person();
        Student s1 = (Student) p1; // ok
        Student s2 = (Student) p2; // runtime error! ClassCastException!
        // instanceof方法
        Person p = new Student();
        if (p instanceof Student) {
            // 只有判断成功才会向下转型:
            Student s = (Student) p; // 一定会成功
        }

        // TODO 区分继承和组合
        //继承是is关系，组合是has关系
        /*
        考察下面的Book类：
        class Book {
            protected String name;
            public String getName() {...}
            public void setName(String name) {...}
        }
        这个Book类也有name字段，那么，我们能不能让Student继承自Book呢？
        class Student extends Book {
            protected int score;
        }
        显然，从逻辑上讲，这是不合理的，Student不应该从Book继承，而应该从Person继承。
        究其原因，是因为Student是Person的一种，它们是is关系，而Student并不是Book。实际上Student和Book的关系是has关系。
        */


    }
}
class Person3 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
}

class Student extends Person3 {
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score=score;
    }
}