package chapter04;

public class Java08_Static {
    public static void main(String[] args) {
        // TODO 静态字段
        // 对于静态字段，无论修改哪个实例的静态字段，效果都是一样的：所有实例的静态字段都被修改了，原因是静态字段并不属于实例
        // 因此，不推荐用实例变量.静态字段去访问静态字段，因为在Java程序中，实例对象并没有静态字段。
        // 在代码中，实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为类名.静态字段来访问静态对象。
        // 推荐用类名来访问静态字段。可以把静态字段理解为描述class本身的字段（非实例字段）。更好的写法是：
        // Person.number = 99;
        // System.out.println(Person.number);

        // TODO 静态方法
        // 调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。
        Person.setNumber(99);
        System.out.println(Person.number);
        // 因为静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
        // 静态方法经常用于工具类。例如：
        //Arrays.sort() / Math.random()
        //静态方法也经常用于辅助方法。注意到Java程序的入口main()也是静态方法

        // TODO 接口的静态字段
        // 因为interface是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为final类型
        /*
        public interface Person {
            public static final int MALE = 1;
            public static final int FEMALE = 2;
        }
         */
        // 实际上，因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉
        /*
        public interface Person {
            // 编译器会自动加上public statc final:
            int MALE = 1;
            int FEMALE = 2;
        }
         */
    }

    class Person {
        public static int number;

        public static void setNumber(int value) {
            number = value;
        }
    }

}

