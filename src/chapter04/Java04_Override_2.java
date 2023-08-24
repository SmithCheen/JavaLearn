package chapter04;

public class Java04_Override_2 {
    public static void main(String[] args) {
        // TODO 覆写Object方法
//        所有的class最终都继承自Object，而Object定义了几个重要的方法：
//        toString()：把instance输出为String；
//        equals()：判断两个instance是否逻辑相等；
//        hashCode()：计算一个instance的哈希值。
//        在必要的情况下，我们可以覆写Object的这几个方法。
    }

    // TODO 调用super
    // 在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用
    class Person {
        protected String name;
        public String hello() {
            return "Hello, " + name;
        }
    }
    class Student extends Person {
        @Override
        public String hello() {
            // 调用父类的hello()方法:
            return super.hello() + "!";
        }
    }

    // TODO final
    // TODO 继承可以允许子类覆写父类的方法。
    // 如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override
    /*
     class Person {
        protected String name;
        public final String hello() {
            return "Hello, " + name;
        }
    }

    class Student extends Person {
        // compile error: 不允许覆写
        @Override
        public String hello() {
        }
    }
     */
    // TODO 用final修饰的类不能被继承
    // 如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final
    /*
    final class Person {
        protected String name;
    }

    // compile error: 不允许继承自Person
    class Student extends Person {
    }
     */
    // TODO 用final修饰的字段在初始化后不能被修改
    // 对final字段重新赋值会报错
    /*
    class Person {
        public final String name = "Unamed";
    }
    Person p = new Person();
    p.name = "New Name"; // compile error!
     */
    // TODO 常用-可以在构造方法中初始化final字段：
    /*
    class Person {
        public final String name;
        public Person(String name) {
            this.name = name;
        }
    }
     */

    // TODO final 总结
    //final修饰符有多种作用：
    //final修饰的方法可以阻止被覆写；
    //final修饰的class可以阻止被继承；
    //final修饰的field必须在创建对象时初始化，随后不可修改。


}
class Person5 {
    private String name;

    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }

    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        if (o instanceof Person) {
            Person5 p = (Person5) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}