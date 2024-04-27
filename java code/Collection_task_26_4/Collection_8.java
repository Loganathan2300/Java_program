/******************************************************************************

Write a Java program to count the frequency of each element in an ArrayList.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
// import java.util.Set;
// import java.util.LinkedHashSet;
// import java.util.HashSet;
public class Collection_8{
	public static void main(String[] args) {
	List <String> list=new ArrayList <>();
	    list.add("Velu");
        list.add("Vani");
        list.add("Maha");
        list.add("Niji");
        list.add("Logu");
        //normal print 
        System.out.println(list.size());
        
        // iterator
        // Iterator itr=list.iterator();  
        // while(itr.hasNext()){
        //     System.out.println(itr.next()); 
        // }
        
        System.out.println("The frequency of the word code is: "+  
                                Collections.frequency(list, "Logu")); 
	}
}
