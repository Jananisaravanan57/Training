package String_Manipulation;

import java.util.Scanner;

public class StringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		int digit =0, ucase =0, lcase=0,spcl =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >=48 && str.charAt(i) <=57) {
				digit++;
			}
			else if(str.charAt(i) >=65 && str.charAt(i) <=90) {
				ucase++;
			}
			else if(str.charAt(i) >=97 && str.charAt(i) <=122) {
				lcase++;
			}
			else {
				spcl++;
			}
		}
		System.out.print("Digit : "+digit +"\nUppercase : "+ucase+"\nLowercase : "+lcase+"\nSpecial char :"+spcl);

	}

}
