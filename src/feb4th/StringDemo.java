package feb4th;

import java.util.HashMap;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc bce def egh hdea";
		
		char[] allChars=str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char ch:allChars)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			hm.put(ch, 1);
		}
		
		System.out.println(hm);

	}

}
