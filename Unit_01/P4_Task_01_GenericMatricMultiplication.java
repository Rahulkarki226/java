package Unit_01;

import java.util.Scanner;

public class P4_Task_01_GenericMatricMultiplication {
	public static void main(String args[])
	{
		System.out.println("Enter R1&C1:");
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter R2&C2");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		if(c1!=r2)
		{
			System.out.println("Multiplication is not possible");
			return;
		}
		int A[][]= new int[r1][c1];
		int B[][]=new int [r2][c2];
		int C[][]=new int [r1][c2];
		System.out.println("A:");
	    for(int i=0;i<r1;i++)
	    {
	    	for(int j=0;j<c1;j++)
	    	{
	    		A[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("B:");
	    for(int i=0;i<r2;i++)
	    {
	    	for(int j=0;j<c2;j++)
	    	{
	    		B[i][j]=sc.nextInt();
	    	}
	    }
	    
	    for(int i=0;i<r1;i++)
	    {
	    	for(int j=0;j<c2;j++)
	    	{  int s=0;
	    		for(int k=0;k<c1;k++)
	    		{
	    			s+=A[i][k]*B[k][j];
	    		}
	    		C[i][j]=s;
	    	}
	    }
	    
	    System.out.println("Resultant array:");
	    for(int i=0;i<r1;i++)
	    {
	    	for(int j=0;j<c2;j++)
	    	{
	    		System.out.print(C[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();   
	}
}
