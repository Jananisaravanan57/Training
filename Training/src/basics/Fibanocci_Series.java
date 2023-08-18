package basics;

import java.util.Scanner;

public class Fibanocci_Series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int first =0, sec = 1;
		System.out.println(first+"\n"+sec);
		for(int i=2;i<n;i++) {
			int third=first+sec;
			System.out.println(third);
			first = sec;
			sec = third;
		}
		
		
	}

}
