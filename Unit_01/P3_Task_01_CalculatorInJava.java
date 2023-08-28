package Unit_01;

class Calculator
{
	int add(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mult(int x,int y)
	{
		return x*y;
	}
	int div(int x,int y)
	{
		return x/y;
	}
}
public class P3_Task_01_CalculatorInJava {

	public static void main(String args[])
	{
	    Calculator c= new Calculator();
	    System.out.println("ADD: "+c.add(10, 20));
	    System.out.println("SUB: "+c.sub(20, 10));
	    System.out.println("MULT: "+c.mult(10, 20));
	    System.out.println("DIV: "+c.div(100, 20));
		
	}
}
