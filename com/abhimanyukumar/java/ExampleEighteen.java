package com.abhimanyukumar.java;

public class ExampleEighteen {
    // Final variable 
    static final int X=10;
    public final void show(){
        System.out.println("Welcome To Java ");
        // You cannot modify final variable  

    }
    public static void main(String[] args) {
        ExampleEighteen exampleEighteen = new ExampleEighteen();
        // exampleEighteen.x++;
        System.out.println(" X : "+exampleEighteen.X);
        exampleEighteen.show();
    }
    
}
