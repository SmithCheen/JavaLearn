package chapter05;

public class Java06_Enum {
    public static void main(String[] args) {
        // TODO enum
        // Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；
        Weekdays day = Weekdays.SUN;
        if (day == Weekdays.SAT || day == Weekdays.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }

        // TODO enum的比较 ==
        // 引用类型比较，要始终使用equals()方法，但enum类型可以例外。
        //  这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较

        // TODO enum类型
        // enum定义的类型就是class，只不过它有以下几个特点：
        //      定义的enum类型总是继承自java.lang.Enum，且无法被继承；
        //      只能定义出enum的实例，而无法通过new操作符创建enum的实例；
        //      定义的每个实例都是引用类型的唯一实例；
        //      可以将enum类型用于switch语句。

        // TODO enum实例方法
        // 通过name()获取常量定义的字符串，注意不要使用toString()；
        String s = Weekdays.SUN.name(); // "SUN"
        // 通过ordinal()返回常量定义的顺序（无实质意义）；
        int n = Weekdays.MON.ordinal(); // 1



        // 可以为enum编写构造方法、字段和方法
        // enum的构造方法要声明为private，字段强烈建议声明为final；
        // enum适合用在switch语句中。

    }

}

enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}