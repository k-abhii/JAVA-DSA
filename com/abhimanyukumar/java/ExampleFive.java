package com.abhimanyukumar.java;

class Test{
    static int x=10; // class variable 
    static int y=20; // class variable
    public void show(){
        int z=30; // Local variable 
        System.out.println(" Inside class test "+z);
    }
}
public class ExampleFive {
    public static void main(String[] args){
        // instance variable 
        Test test = new Test(); // here test is instance variable that is actually object of Test java classes
        test.show();
        System.out.println(" X : "+Test.x+ " Y : "+Test.y);
        // class variable 
        // local variable 
    }
    
}
