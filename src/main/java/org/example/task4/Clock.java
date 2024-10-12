package org.example.task4;

public class Clock implements Readable{
    int hours;
    int minutes;
    int seconds;

    public void setHours(int hours){
        this.hours = hours;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public int tick(){
        this.seconds += 1;
        return this.seconds;
    }

    @Override
    public void readTime(){
        System.out.println("Текущее время: " +this.hours +":" +this.minutes +":" +this.seconds);
    }
}
