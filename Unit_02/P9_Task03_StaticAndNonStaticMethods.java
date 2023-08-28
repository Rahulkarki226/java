package Unit_02;
class sample
{    // non-static method
     int multi(int x,int y)
	{
		return x*y;
	}
     //static method
	static int add(int x,int y)
	{
		return x+y;
	}
}
public class P9_Task03_StaticAndNonStaticMethods {
	
	public static void main(String args[])
	{
		// Call the static method
		int sum=sample.add(5,10);
		System.out.println("Sum: "+sum);
		
		//Call the non-static method
		sample s=new sample();
		int prod=s.multi(5,10);
		System.out.println("Product: "+prod);
		
		
		
	}
	

}
