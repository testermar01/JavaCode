 package jan7th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("kosmik"));
		
		hs.add("selenium");
		
		hs.add("devops");
		
		hs.add("reyaz");
		
		hs.add("delhi");
		
		System.out.println(hs.add("kosmik"));
		
		System.out.println(hs.size());
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
