package feb3rd;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		
		al.add(100);
		
		
		
		//al.add(200.22);
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		
		for(Integer x:al)
		{
			System.out.println(x);
		}
	}

}
