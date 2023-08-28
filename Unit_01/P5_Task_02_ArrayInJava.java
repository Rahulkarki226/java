package Unit_01;

public class P5_Task_02_ArrayInJava {
	public static void main(String args[])
	{
		int A[]= {1,7,6,3,4,5,6,2,8,4},lr=2,j,i;
		for(i=0;i<lr;i++)
		{  int temp=A[i];
			for( j=0;j+1<A.length;j++)
			{
				 A[j]=A[j+1];
			}
		   A[j]=temp;
		}
		System.out.println("Resultant Array:");
		for(int x:A)
		{
			System.out.print(x+" ");
		}
	}
}
