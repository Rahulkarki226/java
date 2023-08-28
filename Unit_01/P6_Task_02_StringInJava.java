package Unit_01;

import java.util.Scanner;

public class P6_Task_02_StringInJava {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the str1&str 2:");
	    String s1=sc.next();
	    String s2=sc.next();
	    int l1=s1.length(),l2=s2.length();
	    if(l1!=l2)
	    {
	    	System.out.println("Not equal");
	    	return ;
	    }
	    else
	    {
	    	for(int i=0;i<l1;i++)
		    {
		    	if(s1.charAt(i)!=s2.charAt(i))
		    	{
		    		System.out.println("Not Equal");
		    		return ;
		    	}
		    }
	    }
	   System.out.println("Equal");
	    
	}
}
