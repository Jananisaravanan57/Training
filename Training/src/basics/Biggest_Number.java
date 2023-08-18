package basics;

import java.util.Scanner;

public class Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array Size ");
		int n = sc.nextInt();
		System.out.println("Enter a value ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Biggest Number is : " +max);

	}

}
