package com.abhimanyukumar.java;
class Room{
    int length;
    int breadth;
    Room(){}
    public int area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        return length*breadth;
    }
    public int area(int x){
        // Method name same ,But parameter different
        this.length=x;
        this.breadth=x;
        return length*breadth;
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        Room object = new Room();
        System.out.println(" Area :"+object.area(10));
        System.out.println(" Area :"+object.area(10,20));
    }

    
}
