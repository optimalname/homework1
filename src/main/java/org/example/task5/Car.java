package org.example.task5;

public class Car implements Drivable {
    private String car_brand;
    private String car_model;
    private int year;

    public void setCar_brand(String car_brand){
        this.car_brand = car_brand;
    }
    public void setCar_model(String car_model){
        this.car_model = car_model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getCar_brand(){
        return car_brand;
    }
    public String getCar_model(){
        return car_model;
    }
    public int getYear(){
        return year;
    }

    public void descriptionCar(){
        System.out.println("О машине: ");
        System.out.println("Марка: " + car_brand);
        System.out.println("Модель: " + car_model);
        System.out.println("Год выпуска: " + year);
    }

    @Override
    public void start(){
        System.out.println("Автомобиль начал движение");
    }
    public void stop(){
        System.out.println("Автомобиль закончил движение");
    }
    public int drive(int distance){
        System.out.println("Пройдена дистанция: "+ distance + "км");
        return distance;
    }
}
