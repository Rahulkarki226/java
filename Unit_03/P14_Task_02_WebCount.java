package Unit_03;

class WebCountClass 
{
	public static int count=0;
	public synchronized void webCount()
	{ // sequential access is forced by this synchronized
		for(int i=0;i<10000;i++)
		{
		  count++;	
		}
	}
}
public class P14_Task_02_WebCount {
		  public static void main(String args[]) throws Exception
		  {
			  WebCountClass obj= new WebCountClass();
			  Thread t1 = new Thread(){
				
				  public void run()
				  {
					  obj.webCount();
				  }
			  };
			  Thread t2 = new Thread(){
					
				  public void run()
				  {
					 obj.webCount(); 
				  }
			  };
			  t1.start();
			  t2.start();
			  
			  t1.join();
			  t2.join();
//			  obj.webCount();
			  System.out.println("Done with main thread!");
			  System.out.println(WebCountClass.count);
		  }
}
