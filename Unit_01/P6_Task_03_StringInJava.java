package Unit_01;
import java.util.Scanner;
public class P6_Task_03_StringInJava {
	public static void main(String args[])
	{
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp="",ans="";
		String str[]=new String[10];
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
			    str[j]=temp;
			    temp="";
			    j++;
			}
			else
			temp+=s.charAt(i);
		}
		str[j]=temp;
		for(int i=j;i>=0;i--)
		{
			ans+=str[i]+" ";
		}
		System.out.println("Answer:"+ans);
	}
}
