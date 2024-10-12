package org.example.task1;

public class Book implements Displayable {
    private String book_name;
    private String author;
    private int year;

    public void setBook(String book_name, String author, int year){
        this.book_name = book_name;
        this.author = author;
        this.year = year;
    }

    public String getBook_name() {
        return this.book_name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    @Override
    public void display(){
        System.out.println(this.book_name);
        System.out.println(this.author);
        System.out.println(this.year);
    }
}
