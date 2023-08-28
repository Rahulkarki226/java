package Unit_03;
import java.util.Scanner;

class T1 extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("loop 1");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class T2 extends Thread
{
	public void run()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		for(int i=2;i<x;i++)
		{  if(x%i==0)
		   {
			System.out.println("Composite number");
			return ;	
		   }
		}
		System.out.println("prime number");
		System.out.println(Thread.currentThread().getName());
		
		
	}
}
class T3 extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("loop 3");
		}
		System.out.println(Thread.currentThread().getName());
	}
}

class T4 extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("loop 3");
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}

public class P14_Task01_Multithreading {
	public static void main(String args[])
	{
		Thread t1=new Thread(new T1(), "t1");
		Thread t2 =new Thread(new T2(), "t2");
		Thread t3=new Thread (new T3(), "t3");
		t1.start();
		t2.start();
		t3.start();
		
		Thread t4 = new Thread (new T4());
		t4.run();
		System.out.println(Thread.currentThread().getName());
	}

}
