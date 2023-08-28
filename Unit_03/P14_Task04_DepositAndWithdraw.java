package Unit_03;

class SharedResource
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw..."+ amount);
	
	if(this.amount<amount)
	{
		System.out.println("Less balance ;Waiting for deposit...");
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	this.amount-= amount;
	if(this.amount<0)
	{
		System.out.println("negative Balance");
		try
		{
			wait();
//			Thread.currentThread().interrupt();
		}
		catch(Exception e)
		{
			
		}
	}
	System.out.println("Now total amount is:"+ this.amount);
	System.out.println("Withdraw Completed...");
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit:"+amount);
		this.amount+=amount;
		System.out.println("deposited completed... ");
		System.out.println("Now total amount is:"+ this.amount);
		notifyAll();
	}
	
}
public class P14_Task04_DepositAndWithdraw {
      public static void main(String args[])
      {
    	  SharedResource c= new SharedResource();
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.withdraw(15000);
    		  }
    	  }.start();
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.withdraw(15000);
    		  }
    	  }.start();
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.withdraw(15000);
    		  }
    	  }.start();
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.withdraw(15000);
    		  }
    	  }.start();
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.withdraw(15000);
    		  }
    	  }.start();
    	  
    	  new Thread()
    	  {
    		  public void run()
    		  {
    			  c.deposit(10000);
    		  }
    	  }.start();
    	  
      }
}

























