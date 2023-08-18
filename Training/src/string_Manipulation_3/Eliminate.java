package string_Manipulation_3;

import java.util.Scanner;

public class Eliminate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		System.out.print("enter a substring to eliminate: ");
		String sub = sc.next();
		System.out.println(str.replace(sub, ""));
		

	}

}
