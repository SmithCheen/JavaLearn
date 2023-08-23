package chapter03;

public class Java03_SwitchJudge {
    public static void main(String[] args) {
        // TODO switch判断
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
            case 3:
                System.out.println("Selected 2, 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}
