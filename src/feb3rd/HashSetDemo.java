package feb3rd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs=new HashSet<String>();
		
		hs.add("Kosmik");
		
		hs.add("Reyaz");
		
		hs.add("Selenium");
		
		hs.add("Kosmik");
		
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
