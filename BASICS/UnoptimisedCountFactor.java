package BASICS;

import java.util.Scanner;

public class UnoptimisedCountFactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;

            }
        }
        System.out.println(count);
    }
    
}
