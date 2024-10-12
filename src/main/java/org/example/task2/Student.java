package org.example.task2;

public class Student implements Printable {
    private String student_name;
    private String student_book;
    private int average_score;

    public void setStudent(String student_name, String student_book, int average_score){
        this.student_name = student_name;
        this.student_book = student_book;
        this.average_score = average_score;
    }

    public String getStudent_name(){
        return this.student_name;
    };
    public String getStudent_book(){
        return this.student_book;
    }
    public int getAverage_score(){
        return this.average_score;
    }

    @Override
    public void print(){
        System.out.println(this.student_name);
        System.out.println(this.student_book);
        System.out.println(this.average_score);

    }
}
