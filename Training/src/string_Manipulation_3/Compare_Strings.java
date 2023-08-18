package string_Manipulation_3;

import java.util.Scanner;

public class Compare_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string: ");
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println("Compare strings Without Ignoring Case: "+compare1(str1,str2));
		System.out.println("Compare strings With Ignoring Case: "+compare2(str1,str2));	

	}

	private static boolean compare2(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.equalsIgnoreCase(str2)) {
			return true;
		}
		else {
			return false;
		}
	}

	private static boolean compare1(String str1, String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
