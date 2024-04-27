import java.util.ArrayList;
import java.util.Iterator;
public class ModelArrayList{
	public static void main(String[] args) {
        ArrayList <String> st = new ArrayList ();
        st.add("vijay");
        st.add("kishor");
        st.add("kavin");
        st.add("mohan");
        // get method 
        System.out.println("get the value "+st.get(3));
        // remove method
        System.out.println("remove the value "+st.remove(2));
        // set method
        System.out.println("set the value "+st.set(0, "anitha"));
        // loop of iterator
        Iterator li=st.iterator();
        
        // System.out.println(li.next());
        
        // hasNext is enter the value on the next by next
        while(li.hasNext()){
            // next is first value get to print 
            System.out.println(li.next());
        }
        
        // clear method:
        System.out.println("after   ");
        st.clear();
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
	}
}
