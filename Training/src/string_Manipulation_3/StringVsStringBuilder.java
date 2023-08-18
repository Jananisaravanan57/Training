package string_Manipulation_3;

import java.util.Scanner;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Zoho";  
		   s.concat(" Corporation"); 
		   System.out.println("Concat using String : "+ s);

		   
		   StringBuffer buffer=new StringBuffer("Zoho");
		      buffer.append(" Corporation");
		      System.out.println("Concat using StringBuffer : " +buffer);
	}

}
