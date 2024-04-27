import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
class LinkedHashSet1{  
 public static void main(String args[]){  
  //Creating LinkedHashSet and adding elements  
    Set<String> set=new LinkedHashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  