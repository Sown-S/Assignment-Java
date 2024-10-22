package finalver2;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> personlist;

    public PersonList() {
        this.personlist = new ArrayList<>();
    }

    public PersonList(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter number of student: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            Student student = new Student();
            System.out.println("Enter information of student " + (i + 1));
            student.addPerson();
            this.personlist.add(student);
        }
    }

    public void addTeacher() {
        System.out.print("Enter number of teacher: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            Teacher teacher = new Teacher();
            System.out.println("Enter information of teacher " + (i + 1));
            teacher.addPerson();
            this.personlist.add(teacher);
        }
    }

    public void updatePerson(String id) {
        int i = 0;
        for (Person person : personlist) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
                System.out.println("Update succesfully");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("No person with id " + id + " found");
        }
    }

    public void deletePersonById(String id) {
        for (int i = 0; i < this.personlist.size(); i++) {
            if (personlist.get(i).getId().equals(id)) {
                personlist.remove(i);
                System.out.println("Delected person with id " + id);
                return;
            }
        }
        System.out.println("No person with id " + id + " found");
    }

    public Person findPersonById(String id) {
        boolean found = false;
        for (Person person : personlist) {
            if (person.getId().equals(id)) {
                System.out.println("Information of this person");
                person.displayInfo();
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("No person with id " + id + " found");
        }
        return null;
    }

    public void displayEveryone() {
        if (personlist.isEmpty()) {
            System.out.println("Person List is empty!");
        } else {
            for (Person person : personlist) {
                person.displayInfo();
                System.out.println("-----------------------------------");
            }
        }
    }

    public Student findTopStudent() {
        if (personlist.isEmpty()) {
            System.out.println("Person List is empty!");
            return null;
        }
        Student topStudent = null;
        for (Person person : personlist) {
            if (person instanceof Student student) {
                if (topStudent == null || topStudent.getGpa() < student.getGpa()) {
                    topStudent = student;
                    System.out.println("TOP STUDENT");
                    topStudent.displayInfo();
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        if (personlist.isEmpty()) {
            System.out.println("Person List is empty!");
            return null;
        }
        boolean found = false;
        for (Person person : personlist) {
            if (person instanceof Teacher teacher) {
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    System.out.println("Information of this teacher:");
                    teacher.displayInfo();
                    System.out.println("----------------------------------");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No teacher found in " + department + " department");
        }
        return null;
    }

    public void checkBookBorrowing() {
        if (personlist.isEmpty()) {
            System.out.println("Person List is empty!");
            return;
        }
        for (Person person : personlist) {
            if (person.isBookOverdue()) {
                System.out.println(person.getFullName() + " has an overdue book");
            } else {
                System.out.println(person.getFullName() + " does not have an overdue book");
            }
        }
    }

}
