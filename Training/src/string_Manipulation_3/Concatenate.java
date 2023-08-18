package string_Manipulation_3;

import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String: ");
		String str1 = sc.next();
		String str2 = sc.next();
		for(int i=0;i<str2.length();i++) {
			str1 +=str2.charAt(i);
		}
		System.out.print("Concatenated String :"+str1);

	}

}
