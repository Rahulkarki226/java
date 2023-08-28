package Unit_02;

//- Create multilevel chain of 3
//- class A and class C contain both default and parameterized constructor
//- class B contain only a single parameterized constructor
//- use super keyword if required
//- Create object of class C and fix the code if required
class A
{
	A()
	{
		System.out.println("default constructor of A");
	}
	A(int x)
	{
		System.out.println("parameterized constructor of A "+x);
	}
}
class B extends A
{  B(int y )
	{
	   System.out.println("parameterized construtor of B "+y);
	}
	
}
class C extends B
{
	C()
	{
		super(5);
		System.out.println("default constructor of C");
	}
	C(int z)
	{
		super(5);
		System.out.println("parameterized constructor of C "+z);
	}
	
}
public class P8_Task02_ConstructorCallInMLI {
     public static void main(String args[])
     {
    	 C obj=new C();
     }
    
}

