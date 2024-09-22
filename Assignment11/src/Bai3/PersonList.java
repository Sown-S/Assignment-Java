package Bai3;

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
    
    
    
}
