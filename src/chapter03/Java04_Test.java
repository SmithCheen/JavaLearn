package chapter03;

public class Java04_Test {
    public static void main(String[] args) {
        // TODO 练习 九层妖塔
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 2*(i+1)-1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
