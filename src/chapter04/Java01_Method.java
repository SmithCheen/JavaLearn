package chapter04;


public class Java01_Method {
    public static void main(String[] args) {
        Person aaa = new Person();
        aaa.setAge(10);
        aaa.setName("123");
        System.out.println(aaa.getName());
        System.out.println(aaa.getAge());

        // 基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响
        // 引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方
        // TODO String不可变特性
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(s); // "world"
        System.out.println(t); // "hello"
        /*
        在 Java 中，String 和 String[] 都是引用类型，存储的是对象的引用。
        但是，String 类型的对象是不可变的，也就是说，一旦创建了一个 String 对象，
        就无法再修改它的值，任何对 String 对象的修改都会创建一个新的对象。
        而 String[] 类型的对象是可变的，也就是说，可以修改数组中的元素值。
         */
        // TODO String 类型对象不可变
        Person p = new Person();
        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"
        // TODO String[] 类型对象是可变的
        Person pp = new Person();
        String[] fullname = new String[] { "Homer", "Simpson" };
        pp.setName(fullname); // 传入fullname数组
        System.out.println(pp.getNames()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(pp.getNames()); // "Bart Simpson"

        /*
        当我们将一个 String[] 类型的变量传递给一个方法时，实际上传递的是该变量所引用的数组对象在内存中的地址。
        因此，当我们在方法中修改数组中的元素值时，对数组进行的修改会影响到原始数组，在方法返回后也能保留。
        而 String 类型因为不可变，修改即创建新的对象也就有了新的地址，所以方法中引用的地址的值没有改变，输出的结果也就没有改变
         */

    }
}

class Person {
    private String name;
    private int age;
    private String[] names;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getNames() {
        return this.names[0] + " " + this.names[1];
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String[] names) {
        this.names = names;
    }
}
