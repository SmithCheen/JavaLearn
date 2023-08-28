package chapter06;

public class Java01_Exception {
    public static void main(String[] args) {
        // TODO 错误

        // 1. 类型转换出现错误
        String s = "123";
//        Integer i = (Integer) s;
        Integer i = Integer.parseInt(s);

        // 2. 递归没有跳出逻辑 StackOverflowError: Error错误
        // 尽量避免
        test();

        // 3. 访问一个为空对象的成员方法时，出现了错误：java.lang.NullPointerException（异常）
        //   Java中异常分为2大类：
        //   3.1 可以通过代码恢复正常逻辑执行的异常，成为运行期异常：RuntimeException
        //   3.2 不可以通过代码恢复正常逻辑执行的异常，成为编译期异常：Exception
        User user = null;
        System.out.printf(user.toString());

    }
    public static void test(){
        test();
    }
}
class User {

}
