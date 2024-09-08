package ex_overloading;

public class Calculation6 {

    void sum6(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum6(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        Calculation6 obj = new Calculation6();
        obj.sum6(2, 10);

    }

}
