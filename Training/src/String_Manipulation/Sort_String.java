package String_Manipulation;

import java.util.Scanner;

public class Sort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an input string: ");
		String str = sc.next();
		int len = str.length();
		char a[] = new char[len];
 		for(int i=0;i<len;i++) {
			a[i]= str.charAt(i);
		}
 		System.out.print("\nSorted characters: ");
 		for(int i=0;i<len;i++) {
 			for(int j=i+1;j<len;j++) {
 				if(a[i]>a[j]) {
 					a[i] = (char) ((a[i]+a[j])-(a[j]= a[i]));
 					
 				}
 			}
 			System.out.print(a[i]);
 		}

	}

}
