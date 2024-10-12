package org.example.task3;

public class Point implements Movable{
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return  x;
    }

    public int getY(){
        return  y;
    }

    @Override
    public void moveDown(int a){
        //y-
        setY(this.y -= a);
    }
    public void moveUp(int a){
        //y+
        setY(this.y += a);
    }
    public void moveRight(int a){
        //x+1
        setX(this.x += a);
    }
    public void moveLeft(int a){
        //x-1
        setX(this.x -= a);
    }
}

