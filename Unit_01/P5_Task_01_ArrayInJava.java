package Unit_01;

public class P5_Task_01_ArrayInJava {
	public static void main(String args[])
	{
		int arr[]= {4, 2, 5,3, 4, 1, 3, 5, 6, 4},flag=-1;
		System.out.print("Duplicate element:");
		for(int i=0;i<arr.length;i++)
		{    flag=-1;
			for(int j=i+1;arr[i]!=-1&&j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{  flag=1;
					arr[j]=-1;
				}
			}
			if(flag==1)
			{
			  System.out.println(arr[i]);
			}
		}
	}
}
