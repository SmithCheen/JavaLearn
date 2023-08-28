- 当发生错误时，例如，用户输入了非法的字符，我们就可以抛出异常。

  如何抛出异常？参考`Integer.parseInt()`方法，抛出异常分两步：

    1. 创建某个`Exception`的实例；
    2. 用`throw`语句抛出。

  下面是一个例子：

  ```
  void process2(String s) {
      if (s==null) {
          NullPointerException e = new NullPointerException();
          throw e;
      }
  }
  ```

  实际上，绝大部分抛出异常的代码都会合并写成一行：

  ```
  void process2(String s) {
      if (s==null) {
          throw new NullPointerException();
      }
  }
  ```

  如果一个方法捕获了某个异常后，又在`catch`子句中抛出新的异常，就相当于把抛出的异常类型“转换”了：

  ```
  void process1(String s) {
      try {
          process2();
      } catch (NullPointerException e) {
          throw new IllegalArgumentException();
      }
  }
  
  void process2(String s) {
      if (s==null) {
          throw new NullPointerException();
      }
  }
  ```

  当`process2()`抛出`NullPointerException`后，被`process1()`捕获，然后抛出`IllegalArgumentException()`。

  如果在`main()`中捕获`IllegalArgumentException`，我们看看打印的异常栈：

  ```
  // exception
  ```

  Run

  打印出的异常栈类似：

  ```
  java.lang.IllegalArgumentException
      at Main.process1(Main.java:15)
      at Main.main(Main.java:5)
  ```

  这说明新的异常丢失了原始异常信息，我们已经看不到原始异常`NullPointerException`的信息了。

  为了能追踪到完整的异常栈，在构造异常的时候，把原始的`Exception`实例传进去，新的`Exception`就可以持有原始`Exception`信息。对上述代码改进如下：

  ```
  // exception
  ```

  Run

  运行上述代码，打印出的异常栈类似：

  ```
  java.lang.IllegalArgumentException: java.lang.NullPointerException
      at Main.process1(Main.java:15)
      at Main.main(Main.java:5)
  Caused by: java.lang.NullPointerException
      at Main.process2(Main.java:20)
      at Main.process1(Main.java:13)
  ```

  注意到`Caused by: Xxx`，说明捕获的`IllegalArgumentException`并不是造成问题的根源，根源在于`NullPointerException`，是在`Main.process2()`方法抛出的。

  在代码中获取原始异常可以使用`Throwable.getCause()`方法。如果返回`null`，说明已经是“根异常”了。

  有了完整的异常栈的信息，我们才能快速定位并修复代码的问题。

  捕获到异常并再次抛出时，一定要留住原始异常，否则很难定位第一案发现场！

  如果我们在`try`或者`catch`语句块中抛出异常，`finally`语句是否会执行？例如：

  ```
  // exception
  ```

  Run

  上述代码执行结果如下：

  ```
  catched
  finally
  Exception in thread "main" java.lang.RuntimeException: java.lang.NumberFormatException: For input string: "abc"
      at Main.main(Main.java:8)
  Caused by: java.lang.NumberFormatException: For input string: "abc"
      at ...
  ```

  第一行打印了`catched`，说明进入了`catch`语句块。第二行打印了`finally`，说明执行了`finally`语句块。

  因此，在`catch`中抛出异常，不会影响`finally`的执行。JVM会先执行`finally`，然后抛出异常。

