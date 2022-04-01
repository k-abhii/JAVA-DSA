import java.io.*;
import java.util.*;

public class PalindromeString {
	public static boolean isPalindrome(String s){
		int left =0, right = s.length()-1;
		while(left<right){
			if(s.charAt(left) == s.charAt(right)){
				left++;
				right--;
			}else{
				return false;
			}
		}
		return true;

	}

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String ss = str.substring(i,j);

				if(isPalindrome(ss)){
					System.out.println(ss);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}