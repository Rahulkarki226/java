package Unit_02;
//- Check how many objects of a class are being created
//- Hint: use static variable to track the count
class abcd
{
   static int c=0;
	abcd()
	{
		c++;
	}
	abcd(int c)
	{
		c++;
	}
}

public class P9_Task02_CountObjects {
	public static void main(String args[])
	{
		abcd obj1=new abcd();
		abcd obj2=new abcd();
		abcd obj3=new abcd();
		abcd obj4=new abcd();
		System.out.println("Total object: "+abcd.c);
	}
}
