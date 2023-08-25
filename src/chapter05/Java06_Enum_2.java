package chapter05;

public class Java06_Enum_2 {
    public static void main(String[] args) {
        // TODO 可以为enum编写构造方法、字段和方法
        Weekdays day = Weekdays.MON;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day + ". Work at home!");
        } else {
            System.out.println("Today is " + day + ". Work at office!");
        }

        // TODO switch
        Weekdays days = Weekdays.SUN;
        switch(days) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + days + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + days + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process " + days);
                // 加上default语句，可以在漏写某个枚举常量时自动报错，从而及时发现错误。
        }

    }

}

enum Weekdays {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekdays(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}