package jan6th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		List<Integer> a=new ArrayList<Integer>();
		
		System.out.println(a.size());
		
		a.add(100);
		
		a.add(200);
		
		a.add(100);
		
		a.add(200);
	
		System.out.println(a.size());
		
		/*
		 * for(int i=0;i<a.size();i++) { System.out.println(a.get(i)); }
		 */
		
		
		for(Integer i:a)
		{
			System.out.println(i);
			
			
			
		}
		
		
		
		

	}

}
