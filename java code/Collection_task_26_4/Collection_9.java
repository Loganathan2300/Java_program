/******************************************************************************

Write a Java program to sort elements in an ArrayList in descending order.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
// import java.util.Set;
// import java.util.LinkedHashSet;
// import java.util.HashSet;
public class Collection_9{
	public static void main(String[] args) {
	List <String> list=new ArrayList <>();
	    list.add("Velu");
        list.add("Vani");
        list.add("Maha");
        list.add("Niji");
        list.add("Logu");
        //normal print 
        System.out.println(list);
        
        //sort and reverseOrder
        Collections.sort(list, Collections.reverseOrder()); 
  
        // Print the sorted ArrayList 
        System.out.println("Sorted ArrayList in Descending order : "+ list);  
	}
}
