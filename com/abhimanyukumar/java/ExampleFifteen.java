package com.abhimanyukumar.java;

public class ExampleFifteen {
    public static void main(String[] args) {
        int [] x = { 10,20,30,40,50,25};
        //int [] y = new int [6];
        // Using normal for loop
        for(int i=0;i<x.length;i++){
            System.out.println(" X --> "+x[i]);
        }
        // Using for Each Loop concept
        for(int z:x){
            System.out.println(" X : "+z);
        }

    }
    
}
