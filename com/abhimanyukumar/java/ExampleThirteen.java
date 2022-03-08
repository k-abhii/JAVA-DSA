package com.abhimanyukumar.java;

public class ExampleThirteen {
    public static void main(String[] args) {
        int [] x = {10,20,30,40,50,25};
        int [] y =new int[6];
        for(int i=0;i<x.length;i++){
            y[i] = x[i];
            System.out.println(" y [ "+i+" ] = "+y[i]);
            if(y[i] == 30){
                break;
            }
        }
    }
    
}
