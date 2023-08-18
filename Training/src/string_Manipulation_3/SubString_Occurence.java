package string_Manipulation_3;

import java.util.Scanner;

public class SubString_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String substring = sc.next();
		System.out.println("Occurences of substring: "+ substringOcc(str, substring));

	}

	private static int substringOcc(String str, String sub) {
		// TODO Auto-generated method stub
		if (str.contains(sub)){
	         return 1 + substringOcc(str.replaceFirst(sub, ""), sub);
	      }
		return 0;
	}

}
