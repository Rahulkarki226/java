package Unit_01;

import java.util.Scanner;

public class P6_Task_01_StringInJava {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the string:");
	    String s=sc.next();
	    int l=s.length()-1;
	    for(int i=0;i<l;i++,l--)
	    {
	    	if(s.charAt(i)!=s.charAt(l))
	    	{
	    		System.out.println("Not palindrome");
	    		return ;
	    	}
	    	
	    }
	    System.out.println("palindrome");
	    
	}
}
