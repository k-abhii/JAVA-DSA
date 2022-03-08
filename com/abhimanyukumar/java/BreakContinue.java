package com.abhimanyukumar.java;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            //System.out.println(" i = "+i);
            /*if(i==5){
                break;//Loop gets terminated when i becomes 5
            }*/
            if(i==5){
                continue;// Going for begginning of loop At that iteration skipped
            }
            System.out.println(" i = "+i);
        }
    }
    
}
