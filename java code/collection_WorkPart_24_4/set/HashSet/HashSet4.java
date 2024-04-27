import java.util.*;  
class HashSet4{  
 public static void main(String args[]){  
   List<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");  
             
           Set<String> set=new LinkedHashSet(list);  
           set.add("Gaurav");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}