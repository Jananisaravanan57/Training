package string_Manipulation_3;

import java.util.Scanner;

public class Replace_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		System.out.print("Enter a char : ");
		char find = sc.next().charAt(0);
		System.out.print("Replace char: ");
		char replace = sc.next().charAt(0);
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == find) {
				ch[i] = replace;
			}
		}
		System.out.println(ch);
		

	}

}
