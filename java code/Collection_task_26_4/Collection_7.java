/******************************************************************************

Write a Java program to find the intersection of two sets. Create two HashSet objects containing integers and
find the intersection of these sets.

*******************************************************************************/
// import java.util.List;
// import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
// import java.util.LinkedHashSet;
import java.util.HashSet;
public class Collection_7{
	public static void main(String[] args) {
	Set <String> list=new HashSet <>();
	list.add("Velu");
        list.add("Vani");
        list.add("Maha");
        list.add("Niji");
        list.add("Logu");
        //normal print 
        System.out.println(list);
        
        // iterator
        // Iterator itr=list.iterator();  
        // while(itr.hasNext()){
        //     System.out.println(itr.next()); 
        // }
        
        //remove the duplicates by using HashSet or LinkedHashSet
        Set<String> convert = new HashSet<String>(); 
        convert.add("Achu");
        convert.add("gokul");
        convert.add("karthik");
        convert.add("sandy");
        convert.add("Logu");
        
        //normal print
        System.out.println(convert);
        
        Set<String> intersection = new HashSet<>(list);
        // pass the another object to retain the values 
        intersection.retainAll(convert);
        System.out.println("Intersection set is: "+ intersection); 
        
        // // iterator
        // Iterator itrs=convert.iterator();  
        // while(itrs.hasNext()){
        //     System.out.println(itrs.next()); 
        // }
	}
}
