package assignment10;

import java.util.Date;

class Author {

    private String name;
    private String national;
    private Date dateOfBirth;

    public Author() {
    }

    public Author(String name, String nationality, Date dateOfBirth) {
        this.name = name;
        this.national = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return national;
    }

    public void setNationality(String nationality) {
        this.national = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", National: " + national + ", DateOfBirth: " + dateOfBirth;
    }
}

class Book {

    private String title;
    private Author author;
    private int yearPublished;

    public Book() {
    }

    public Book(String title, Author author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "\n\tINFO BOOK" + "\nTitle: " + title + "\nAuthor: " + author + "\nYearPublished: " + yearPublished;
    }
}
