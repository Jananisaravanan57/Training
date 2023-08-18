package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n + " is : "+  fact(n));

	}

	private static long fact(int n) {
		// TODO Auto-generated method stub
		if(n== 0)
		return 1;
		else {
			return (n*(fact(n-1)));
		}
	}

}
