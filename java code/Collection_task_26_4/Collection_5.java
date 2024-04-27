/******************************************************************************

Write a Java program to create a TreeSet of strings and add five strings to it.
Then, print all the strings in sorted order.

*******************************************************************************/
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Collection_5{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
	Set <String> set=new TreeSet <>();
	set.add("Velu");
        set.add("Vani");
        set.add("Maha");
        set.add("Niji");
        set.add("Logu");
        System.out.println(set);
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){  
           System.out.println(itr.next());  
        } 
        //for loop
        System.out.println("\n For loop ");
        for(String i: set){
            System.out.println(i);
        }
	}
}
