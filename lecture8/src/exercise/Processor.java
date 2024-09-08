package exercise;

public class Processor {

    public static void main(String[] args) {
        Student sv = new Student();
        sv = sv.enterStudentInfo(sv);
        System.out.println(sv.toString());

    }

}
