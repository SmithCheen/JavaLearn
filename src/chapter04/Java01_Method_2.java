package chapter04;

public class Java01_Method_2 {
    public static void main(String[] args) {
        Person2 p = new Person2("Xiao Ming", 15);
        Person2 p2 = new Person2("Xiao Ming");
        Person2 p3 = new Person2();
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person2 {
    private String name;
    private int age;

    // TODO 多构造方法
//    public Person2(){
//    }
//    public Person2(String name) {
//        this.name = name;
//        this.age = 12;
//    }
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person2(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public Person2() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}