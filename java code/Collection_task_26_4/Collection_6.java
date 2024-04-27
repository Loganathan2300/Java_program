/******************************************************************************

Write a Java program to remove duplicates from an ArrayList of integers

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class Collection_6{
	public static void main(String[] args) {
		List <String> list=new ArrayList <>();
		list.add("Velu");
        list.add("Vani");
        list.add("Maha");
        list.add("Niji");
        list.add("Niji");
        list.add("Logu");
        list.add("Logu");
        System.out.println(list);
        // remove the duplicates by using HashSet or LinkedHashSet
        Set<String> convert = new LinkedHashSet<String>(list); 
        //normal print
        System.out.println(convert);
        // iterator
        Iterator itr=convert.iterator();  
        while(itr.hasNext()){
            System.out.println(itr.next()); 
        }
        // HashSet destructur
        Set<String> convert1 = new HashSet<String>(list);  
        System.out.println(convert1);
	}
}
