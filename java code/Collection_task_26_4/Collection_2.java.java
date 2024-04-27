/******************************************************************************
Write a Java program to create a HashSet of integers and add ten integers to it. 
Then, print all the integers in the HashSet.
*******************************************************************************/
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Collection_2{
	public static void main(String[] args) {
	    
        Set <Integer> set=new HashSet <Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        //Iterator the HashSet
        Iterator itr=set.iterator();
        System.out.println("while the HashSet : ");
        //whileloop
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //for loop
        System.out.println("for loop : ");
        for(int i:set){
            System.out.println(i);
        }
	}
}
