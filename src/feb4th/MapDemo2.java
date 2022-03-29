package feb4th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(333, "Peter");
		
		hm.put(100, "Ram");
		
		hm.put(101, "John");
		
		hm.put(102, "Sam");
		
		System.out.println(hm);
		
		Set<Entry<Integer, String>> entrySet=hm.entrySet();
		
		
		Iterator<Entry<Integer, String>> it=entrySet.iterator();
		
		
	while(it.hasNext())
	{
		
		Entry<Integer, String> entry=it.next();
		
		System.out.println("Entry key is "+entry.getKey()+"-----"+"Entry value is "+entry.getValue());
	}

	}

}
