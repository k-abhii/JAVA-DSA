package com.abhimanyukumar.java;
import java.util.*;


public class ExampleEight {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.next();
      String inputstr;
      switch(inputstr = str){
         case "Red" :
         System.out.println(" Kolkata, Howrah, North 24 PGS ");
         System.out.println(" In Red Category ");
         break;
         case "Green" :
         System.out.println(" South 24 PGS ");
         System.out.println(" In Green Category ");
         break;
         case "Yellow" :
         System.out.println(" Birhum ");
         System.out.println(" In Yellow Category ");
         break;
         default :
         System.out.println(" All are in General Category ");
      }
       
   } 
}
