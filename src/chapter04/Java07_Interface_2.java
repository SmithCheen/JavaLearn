package chapter04;

public class Java07_Interface_2 {
    // TODO 术语
    // Java的接口特指interface的定义，表示一个接口类型和一组方法签名，而编程接口泛指接口规范，如方法签名，数据格式，网络协议等
    /*
    抽象类和接口的对比如下：
           abstract class	    interface
继承	       只能extends一个class	可以implements多个interface
字段	       可以定义实例字段	    不能定义实例字段
抽象方法	   可以定义抽象方法	    可以定义抽象方法
非抽象方法   可以定义非抽象方法	    可以定义default方法
     */
    // TODO 接口继承
    // 一个interface可以继承自另一个interface。interface继承自interface使用extends，它相当于扩展了接口的方法。
    interface Hello {
        void hello();
    }
    interface Person extends Hello {
        void run();
        String getName();
    }
    //Person接口继承自Hello接口，因此，Person接口现在实际上有3个抽象方法签名，其中一个来自继承的Hello接口

    // TODO 继承关系
    //

    // TODO default方法
    // 实现类可以不必覆写default方法。
    // default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。
    // 如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
    // TODO default方法和抽象类的普通方法是有所不同的。
    // 因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。

}
