package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {
        // TODO 标识符
        String name = "kk";
        System.out.println(name);

        // TODO 标识符的命名规则
        // @, #, %, $
        //标识符只能采用下划线_和美元$符号，其他符号不能使用，称之为特殊符号
        String _name = "kk";
        String $name = "kk";
        System.out.println(_name);
        System.out.println($name);

    }
}
