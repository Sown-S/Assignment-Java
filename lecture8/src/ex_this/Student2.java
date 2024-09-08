package ex_this;

public class Student2 {

    int id;
    String name;

    Student2(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student2 e1 = new Student2(111, "Karan");
        Student2 e2 = new Student2(222, "Aryan");
        e1.display();
        e2.display();
    }

}
