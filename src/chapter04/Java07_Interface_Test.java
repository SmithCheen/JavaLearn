package chapter04;

import java.util.Scanner;
import java.util.HashMap;

//java接口 编写一个简单的银行账户管理系统，包括添加账户、删除账户、查询余额和转账等功能。可以使用接口来定义这些功能，并实现相应的方法
public class Java07_Interface_Test {
    public static void main(String[] args) {
        Bank name_list = new Account();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1.添加用户");
            System.out.println("2.删除用户");
            System.out.println("3.查询余额");
            System.out.println("4.转账");
            int id = scanner.nextInt();

            switch (id) {
                case 1 -> name_list.addAccount();
                case 2 -> name_list.deleAccount();
                case 3 -> name_list.getAccount();
                case 4 -> name_list.transfer();
                default -> System.out.println("输入错误 没有这个模式");
            }
        }
    }
    //定义一个Bnnk接口，包含账户信息和操作方法
    interface Bank {
        //添加用户
        void addAccount();
        //删除用户
        void deleAccount();
        //查询用户余额
        void getAccount();
        //转账
        void transfer();
    }
    static class Account implements Bank {
        private HashMap<String, Double> dict = new HashMap<>();

        @Override
        public void addAccount() {
            String Aoonr_name = Aasndj_name("添加用户");
            if (dict.containsKey(Aoonr_name)) {
                System.out.println("已经存在");
                return;
            }
            System.out.println("输入存入余额");
            Scanner scanner = new Scanner(System.in);
            double money_name = scanner.nextInt();
            dict.put(Aoonr_name, money_name);
            System.out.println(dict);

        }
        @Override
        public void deleAccount() {
            String Aoonr_name = Aasndj_name("删除用户");
            if (dict.containsKey(Aoonr_name)) {
                dict.remove(Aoonr_name);
                System.out.println("删除成功");
            } else {
                System.out.println("没有");
            }
        }
        @Override
        public void getAccount() {
            String Aoonr_name = Aasndj_name("查询");
            System.out.println("余额:" + dict.get(Aoonr_name));
        }
        @Override
        public void transfer() {
            String Aoor_name = Aasndj_name("转账的用户");
            String trans_list = Aasndj_name("被转账的用户");
            if (dict.containsKey(Aoor_name) && dict.containsKey(trans_list)) {
                double money = Aasndj_name();
                if (dict.get(Aoor_name) < money) {
                    System.out.println("余额不足");
                    return;
                }
                double ko = dict.get(trans_list) + money;
                dict.put(trans_list, ko);
                System.out.println("转账成功");
            } else {
                System.out.println("错误 重新操作,用户不存在");
            }
        }
        //输入名字
        private String Aasndj_name(String asd) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入" + asd);
            String Aoonr_name = scanner.nextLine();
            return Aoonr_name;
        }
        private double Aasndj_name() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入转账余额:");
            double Aoonr_name = scanner.nextDouble();
            return Aoonr_name;
        }
    }
}

