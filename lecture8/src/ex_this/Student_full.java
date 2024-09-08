package ex_this;

public class Student_full {

    int id;
    String name;
    int age;

    Student_full(int i, String n) {
        id = i;
        name = n;
    }

    Student_full(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + age);
    }

    public static void main(String[] args) {
        Student_full s1 = new Student_full(111, "Karan");
        Student_full s2 = new Student_full(222, "Aryan", 29);
        s1.display();
        s2.display();

    }

}
