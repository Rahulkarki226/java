package Unit_01;

import java.util.Scanner;

public class P5_Task_03_ArrayInJava {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
		{
			 A[i]=sc.nextInt();
		}
		System.out.print("Enter relement:");
		int r=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(A[i]==r)
			{
				for(int j=i;j+1<n;j++)
				{
					A[j]=A[j+1];
				}
				n--;
				i--;
			}
		}
		System.out.println("resultant array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		
	}


}
