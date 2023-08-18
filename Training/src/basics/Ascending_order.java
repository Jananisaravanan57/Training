package basics;

import java.util.Scanner;

public class Ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array Size: ");
		int n = sc.nextInt();
		System.out.println("Enter a values: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("\nAscending order ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					a[i] = (a[i]+a[j])-(a[j]= a[i]);
				}
			}
			System.out.print(a[i]+" ");
		}
		

	}

}
