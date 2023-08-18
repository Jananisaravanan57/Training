package String_Manipulation;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		int len = str.length();
		char a[] = new char[len];
		int inc =-1;
 		for(int i=len-1;i>=0;i--) {
			a[i]= str.charAt(++inc);
		}
 		System.out.println("\nThe given String is "+ palindrome(a,len,inc));

	}

	private static String palindrome(char[] a,int len,int inc) {
		// TODO Auto-generated method stub
		for(int i=0;i<len;i++) {
 			if(a[i] != a[inc--]) {
 				return "Not a Palindrome.";	
 			}	
 		}
		return "Palindrome.";
		
	}

}
