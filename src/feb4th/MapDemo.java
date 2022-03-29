package feb4th;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(333, "Peter");
		
		hm.put(100, "Ram");
		
		hm.put(101, "John");
		
		hm.put(102, "Sam");
		
		System.out.println(hm);
		
		System.out.println(hm.get(102));
		
		System.out.println(hm.containsKey(102));
		
		System.out.println(hm.containsKey(103));
		
		Set<Entry<Integer, String>> entrySet=hm.entrySet();
		
		for(Entry<Integer, String> e:entrySet)
		{
			System.out.println("Entry key is "+e.getKey()+"----"+"Entry Value is "+e.getValue());
		}
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());

	}

}
