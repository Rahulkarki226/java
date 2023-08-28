package Unit_03;

class CustomThreadStartOrRun implements Runnable
{
	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
}
public class P14_Task_03_RunOrStart {
	public static void main(String args[])
	{
		CustomThreadStartOrRun obj = new CustomThreadStartOrRun();
		Thread threadone = new Thread(obj,"T1");
		Thread threadtwo= new Thread(obj,"T2");
		
		threadone.run();
		threadtwo.run();
		

//		threadone.start();
//		threadtwo.start();
		System.out.println(Thread.currentThread().getName());
	}
	

}
