package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> personList;

    public PersonList() {
    }

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter numbers of student to add: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            Student student = new Student();
            System.out.println("Enter information of student " + (i + 1));
            student.addPerson();
            this.personList.add(student);
        }
    }

    public void addTeacher() {
        System.out.print("Enter numbers of teacher to add: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            Teacher teacher = new Teacher();
            System.out.println("Enter information of teacher " + (i + 1));
            teacher.addPerson();
            this.personList.add(teacher);
        }
    }

    public void updatePerson(String id) {
        int i = 0;
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
                System.out.println("Updated successfully!");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("No person with id " + id + " found");
        }
    }

    public void deletePerson(String id) {
        for (int i = 0; i < this.personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                System.out.println("Delected person with id " + id);
                return;
            }
        }
        System.out.println("No person with id " + id + " found");
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println("Information of this person");
                person.displayInfo();
            }
        }
        System.out.println("No person with id " + id + " found");
        return null;
    }

    public void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("Person list is empty!");
        } else {
            for (Person person : personList) {
                person.displayInfo();
                System.out.println("----------------------------------------");
            }
        }
    }

    public Student findTopStudent() {
        if (personList.isEmpty()) {
            System.out.println("Person list is empty!");
            return null;
        }
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student student) {
                if (topStudent == null || topStudent.getGpa() < student.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        if (personList.isEmpty()) {
            System.out.println("Person list is empty!");
            return null;
        }
        for (Person person : personList) {
            if (person instanceof Teacher teacher) {
                if (teacher.getDepartment().equals(department)) {
                    System.out.println("Information of this teacher");
                    teacher.displayInfo();
                }
            }
        }
        System.out.println("No teachers found in " + department + " department");
        return null;
    }

}
