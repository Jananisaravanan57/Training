package Collections;

import java.util.Hashtable;


//Hashtable class doesn't allow null key or value
public class Hash_TableExample {
	public static void main(String args[])
    {
        
        Hashtable<Integer, String> ht1 = new Hashtable<>();
 
        Hashtable<Integer, String> ht2 = new Hashtable<>();
 
      
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
 
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("\nMappings of ht2 : " + ht2);
        
        ht1.put(2, "twos");
        System.out.println("\nAfter Updating\nMappings of ht1 : " + ht1);
        
        ht1.remove(3);
        System.out.println("\nAfter remove element \nMappings of ht1 : " + ht1);
        
       System.out.println("\ncontains method:" +ht1.contains("one"));
    }

}
