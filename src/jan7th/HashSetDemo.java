 package jan7th;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.add("kosmik"));
		
		hs.add("selenium");
		
		hs.add("devops");
		
		hs.add("reyaz");
		
		System.out.println(hs.add("kosmik"));
		
		System.out.println(hs.size());
		
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		
		
		
		
	}

}
