package feb3rd;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40,50};
		
		System.out.println("length of a "+a.length);
		
		
		int[] b=new int[10];
		
		System.out.println("length of b "+b.length);
		
		b[0]=100;
		b[9]=900;
		//b[10]=1000;
		b[7]=700;
		//b[8]=800.88;
		
		for(int temp:a)
		{
			System.out.println(temp);
		}
		
		for(int temp:b)
		{
			System.out.println(temp);
		}
			
			

	}

}
