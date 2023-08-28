package chapter05;

public class Java02_StringBuilder {
    public static void main(String[] args) {
        // TODO StringBuilder 可变对象，用来高效拼接字符串
        // 1. String类可以使用'+'拼接字符串,但因为String的不可变性,每次都会创建新的对象,这样不但浪费了内存,还影响了效率
        // 为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，
        // 这样，往StringBuilder中新增字符时，不会创建新的临时对象
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        //System.out.println(s);
        // 2. StringBuilder还可以进行链式操作
        var sb2 = new StringBuilder(1024);
        sb2.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb2.toString());

        // TODO StringBuilder 支持链式操作，实现链式操作的关键是返回实例本身
        // 对于普通的字符串+操作，并不需要我们将其改写为StringBuilder，因为Java编译器在编译时就自动把多个连续的+操作编码为StringConcatFactory的操作。
        // 在运行期，StringConcatFactory会自动把字符串连接操作优化为数组复制或者StringBuilder操作。
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());

        // TODO StringBuffer StringBuilder的线程安全版本，现在很少使用。

    }
    static class Adder {
        private int sum = 0;

        public Adder add(int n) {
            sum += n;
            return this;
        }

        public Adder inc() {
            sum ++;
            return this;
        }

        public int value() {
            return sum;
        }
    }
}
