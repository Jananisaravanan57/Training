package string_Manipulation_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,",.' ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		

	}

}
