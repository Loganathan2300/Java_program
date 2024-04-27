/******************************************************************************
Write a Java program to create a HashMap where the keys are strings and the values are integers.
Add five key-value pairs to the HashMap, and then print all the keys and their corresponding values.
*******************************************************************************/
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class Collection_4{
	public static void main(String[] args) {
	    
        Map <String,Integer> map=new HashMap <String,Integer>();
        map.put("Velu",54);
        map.put("Vani",48);
        map.put("Maha",26);
        map.put("niji",29);
        map.put("logu",24);
        //get the key value 
        for(String key:map.keySet()){
            System.out.print("\n"+key);
        }
        //get the key and value pair
        System.out.println("All the key and Value Pair : "); 
        for(Map.Entry alldata: map.entrySet()){
            System.out.println(alldata.getKey()+" "+alldata.getValue()); 
        }
        //Add the key and Value
        map.putIfAbsent("Gaurav",103);  
        System.out.println("After invoking putIfAbsent() method ");  
        for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
	}
}

=========================================================================================


/******************************************************************************
Write a Java program to create a HashMap where the keys are strings and the values are integers.
Add five key-value pairs to the HashMap, and then print all the keys and their corresponding values.
*******************************************************************************/
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class Main{
	public static void main(String[] args) {
	    
        Map <String,Integer> map=new HashMap <String,Integer>();
        map.put("Velu",54);
        map.put("Vani",48);
        map.put("Maha",26);
        map.put("niji",29);
        map.put("logu",24);
        for(Map.Entry m:map.entrySet()){    
           System.out.println(m+"sdkjvdj");    
          } 
        System.out.print("\n"+map+"mhjm");
        //get the key value 
        for(String key:map.keySet()){
            System.out.print("\n"+key);
        }
        //get the key and value pair
        System.out.println("All the key and Value Pair : "); 
        for(Map.Entry alldata: map.entrySet()){
            System.out.println(alldata.getKey()+" "+alldata.getValue()); 
        }
        //Add the key and Value
        map.putIfAbsent("Gaurav",103);  
        System.out.println("After invoking putIfAbsent() method ");  
        for(Map.Entry m:map.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }  
	}
}
