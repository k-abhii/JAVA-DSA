package BASICS;

import java.util.Scanner;
public class CountFactor{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count =0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        System.out.println(count);
    }
}
