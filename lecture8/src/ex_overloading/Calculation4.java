package ex_overloading;

public class Calculation4 {

    void sum4(int a, long b) {
        System.out.println(a + b);
    }

    void sum4(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculation4 obj = new Calculation4();
        obj.sum4(30, 30);
        obj.sum4(50, 50, 50);
    }

}
