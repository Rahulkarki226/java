package Unit_01;

public class P5_Task_05_ArrayInJava {
	public static void main(String args[])
	{
		 int[] arr = {1, 2, 3, 4, 5};
	        int insertIndex = 2;
	        int insertElement = 10,j=0;
	     int []newarr = new int[arr.length+1];
	     for(int i=0;i<newarr.length;i++)
	     {
	    	 if(i==insertIndex)
	    	 {
	    		 newarr[i]=insertElement;
	    	 }
	    	 else
	    	 {
	    		 newarr[i]=arr[j];
	    		 j++;
	    	 }
	     }
	     arr=newarr;
	     System.out.print("Resultant Array:");
	     for(int x:arr)
	     {
	    	 System.out.print(x+" ");
	     }

	}
}
