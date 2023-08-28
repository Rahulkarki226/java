package Unit_01;

import java.time.LocalDate;
import java.util.Scanner;

public class P7_Task_01_SwtichCasesInJava {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Press 1-4 button:");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			 System.out.println("Current year: "+LocalDate.now().getYear());
			 break;
		case 2:
			 System.out.println("Current month:"+LocalDate.now().getMonth());
			 break;
		case 3:
			 System.out.println("Current Day:"+LocalDate.now().getDayOfWeek());
			 break;
		case 4:
			 System.out.println("Not applicable");
			 break;
	    default:
	    	 System.out.println("Invalid option");
	    	 break;
		}
		sc.close();
	}
}
