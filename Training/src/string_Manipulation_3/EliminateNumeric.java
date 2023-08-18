package string_Manipulation_3;

import java.util.Scanner;

public class EliminateNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>='0'&& str.charAt(i)<='9')) {
				str1 +=str.charAt(i);
			}
		}
		System.out.println("After eliminating numeric value :"+str1);
	}

}
