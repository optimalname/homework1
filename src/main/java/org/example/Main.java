package org.example;

import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;
import org.example.task4.Clock;
import org.example.task5.Car;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("1. Задача Книга:");
        book1.setBook("Мастер и Маргарита", "Булгаков М.А.", 1940);
        book1.display();

        Student student1 = new Student();
        System.out.println("2. Задача Студент:");
        student1.setStudent("Иванов И.И.", "1234-5678", 5);
        student1.print();

        Point point1 = new Point();
        System.out.println("3. Задача про точку на плоскости:");
        point1.setX(7);
        point1.setY(2);
        point1.moveDown(1);
        point1.moveUp(0);
        point1.moveRight(1);
        point1.moveLeft(0);

        int px = point1.getX();
        int py = point1.getY();

        System.out.println("Текущее положение по x: " +px);
        System.out.println("Текущее положение по y: " +py);

        Clock clock1 = new Clock();
        System.out.println("4. Задача про часы: ");
        clock1.setHours(17);
        clock1.setMinutes(48);
        clock1.setSeconds(23);
        clock1.tick();
        clock1.readTime();

        Car car1 = new Car();
        System.out.println("5. Задача про машину:");
        car1.setCar_brand("Audi");
        car1.setCar_model("A5");
        car1.setYear(2007);
        car1.descriptionCar();
        car1.start();
        car1.stop();
        car1.drive(8000);
    }
}