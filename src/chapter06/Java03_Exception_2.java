package chapter06;

public class Java03_Exception_2 {
    public static void main(String[] args) {

        // TODO 抛出异常
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void process2() {
        throw new NullPointerException();
    }
    /*
    java.lang.IllegalArgumentException: java.lang.NullPointerException
	at chapter06.Java03_Exception_2.process1(Java03_Exception_2.java:18)
	at chapter06.Java03_Exception_2.main(Java03_Exception_2.java:8)
    TODO Caused by: java.lang.NullPointerException
	at chapter06.Java03_Exception_2.process2(Java03_Exception_2.java:23)
	at chapter06.Java03_Exception_2.process1(Java03_Exception_2.java:16)
	... 1 more
     */
}

