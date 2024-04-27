import java.util.Set;  
import java.util.HashSet;
import java.util.Iterator;
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    Set<String> set=new HashSet();  
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