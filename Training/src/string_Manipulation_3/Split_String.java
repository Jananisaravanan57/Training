package string_Manipulation_3;

import java.util.Scanner;

public class Split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String  str = sc.nextLine();
		String[] str1 = str.split("[,.' ]");
		for(int i=0;i<str1.length;i++) {
			
			System.out.println(str1[i]);
		}
		

	}

}
