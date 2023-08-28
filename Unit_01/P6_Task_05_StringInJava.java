package Unit_01;
import java.util.Scanner;
public class P6_Task_05_StringInJava {
      public static void main(String args[])
      {
    	  System.out.print("Enter the string:");
    	  Scanner sc= new Scanner(System.in);
    	  String s=sc.nextLine().toLowerCase();
    	  int []c=new int[26];
    	  for(int i=0;i<s.length();i++)
    	  {
    		  char ch=s.charAt(i);
    		  if(Character.isLetter(ch))
    		  {
    			  c[ch-'a']++;
    		  }
    	  }
    	  for(int x:c)
    	  {
    		  if(x==0)
    		  {
    			  System.out.println("Not pangram");
    			  return ;
    		  }
    	  }
    	  System.out.println("Pangram");
    	  
      }
}
