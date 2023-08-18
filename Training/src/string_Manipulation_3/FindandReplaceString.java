package string_Manipulation_3;

import java.util.Scanner;

public class FindandReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		System.out.print("Enter a substring to change: ");
		String find = sc.next();
		System.out.print("Replace substring: ");
		String replace = sc.next();
		String replacestr = str.replace(find, replace);
		System.out.println(replacestr);
		

	}

}
