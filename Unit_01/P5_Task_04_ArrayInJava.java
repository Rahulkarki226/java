package Unit_01;

public class P5_Task_04_ArrayInJava {
	public static void main(String args[])
	{
		int A[]= {1,7,6,3,4,5,6,2,8,4};
		int max=A[0],smax=Integer.MIN_VALUE,min=A[0],smin=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++)
		{
			if(max<A[i])
			{
				smax=max;
				max=A[i];
				
			}
			else if(smax<A[i]&&A[i]!=max)
			{
				smax=A[i];
			}
		    if(min>A[i])
		    {
		    	smin=min;
		    	min=A[i];
		    }
		    else if(smin>A[i]&&A[i]!=min)
		    {
		    	smin=A[i];
		    }
		}
	    System.out.println(smax+" "+smin);
		
		
	}

}
