package ex_this;

public class Student3 {

    int id;
    String name;

    Student3() {
        System.out.println("Default constructor is invoked");
    }

    Student3(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student3 t1 = new Student3(111, "Karan");
        Student3 t2 = new Student3(222, "Aryan");
        t1.display();
        t2.display();
    }

}
