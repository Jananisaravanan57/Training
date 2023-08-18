package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	   
	    LinkedList<String> color = new LinkedList<>();

	    color.add("Purple");
	    color.add("Black");
	    color.add("Blue");
	    	
	    System.out.println("LinkedList: " + color);
	    System.out.println("Enter a color to add: ");
	    String s = sc.next();
	    color.add(s);
	    System.out.println("Updated LinkedList: " + color);
	    
	    System.out.println("Enter a color to add with position: ");
	    String s1 = sc.next();
	    int n1 = sc.nextInt();
	    color.add(n1, s1);
	    System.out.println("Updated LinkedList: " + color);
	    
	    System.out.println("Enter a index num to remove element: ");
	    int n = sc.nextInt();
	    color.remove(n);
	    System.out.println("Updated LinkedList: " + color);
	    
	    System.out.println("Enter a color to add at first");
	    String s2 = sc.next();
	    color.addFirst(s2);
	    System.out.println("Updated LinkedList: " + color);
	    
	    System.out.println("Enter a color to add at last");
	    String s3 = sc.next();
	    color.addLast(s3);
	    System.out.println("Updated LinkedList: " + color);
	    
	   
	  }
	
	}