package com.abhimanyukumar.java;

public class ExampleEleven {
    public static void main(String[] args) {
        int [] x = {10,20,30,40,50,25};
        int [] y = new int[6];
        int i=1;
        while(i<x.length){
            y[i]=x[i];
            System.out.println(" y [ "+i+" ] = "+y[i]);
            i++;
        }
    }
    
}
