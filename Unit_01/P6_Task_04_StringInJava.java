package Unit_01;
import java.util.Scanner;
public class P6_Task_04_StringInJava {
  public static void main(String[] args) {
	String []symb= {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	int []val= {100,90,50,40,10,9,5,4,1};
	String ans="";
	System.out.print("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();//80
	int i=0;
	while(num>0)
	{
		int q=num/val[i];//1
		num %=val[i];//30
		for(int j=0;j<q;j++)
		{
		    ans+=symb[i];
		}
		i++;
	}
	System.out.println("RNo: "+ans);
	sc.close();
}

}
