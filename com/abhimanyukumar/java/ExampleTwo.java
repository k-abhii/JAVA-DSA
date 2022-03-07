package com.abhimanyukumar.java;
class ExampleOne{
    String name = " Abhimanyu Kumar";
    public void display(){
        System.out.println(" Display my name : "+name);
    }
}

public class ExampleTwo {
public static void main(String[] args) {
    ExampleOne exampleOne = new ExampleOne();
    exampleOne.display();
    System.out.println(" Inside Example Two Class");
    
}    
}
