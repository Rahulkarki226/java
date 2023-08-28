package Unit_02;

class ABC
{
	int add(int x,int y)
	{
		return x+y;
	}
	// overriding
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}
class CBA extends ABC
{
	// overloading
	int add(int x,int y)
	{
		return x+y+5;
	}
}
public class P10_Task01_PolymorphismInJava {

	public static void main(String args[])
	{
		ABC r=new CBA();
		// Run time method dispatch
		System.out.println("Addition: "+r.add(2,3));
	}
	
}
