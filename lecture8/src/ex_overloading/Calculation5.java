package ex_overloading;

public class Calculation5 {

    void sum5(int a, long b) {
        System.out.println("int arg method invoked");
    }

    void sum5(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        Calculation5 obj = new Calculation5();
        obj.sum5(10, 10);
    }

}
