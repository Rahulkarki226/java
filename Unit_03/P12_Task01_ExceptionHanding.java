package Unit_03;

import java.util.*;
class exception{
    void basicException() {
        int b=0;
        int a=10/b;
        System.out.println(a);
        System.out.println("complete");
    }
    void handleException() {
        try {
            int b=0;
            int a=10/b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Divsion by zero");
        }
    }
    void multipleCatch() {

        try {
            int b=4,a=8;
            int arr[]=new int[5];
            arr[5]=a/b;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("division by zero");
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
    }
    void inputMinsmatchException() {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number:");
            int num=sc.nextInt();
            System.out.println("value"+num);
            
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
     
    }
    void stackOverFlowError(int i) {
        try {
            while(i>0) {
                i++;
                stackOverFlowError(i);
            }
            //this is error can't resolved because it is not a exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Other code execute!!");

    }

    void indexOutofBoundException() {
        try {
            int[] num= {1,2,3,4};
            System.out.println(num[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception");
        }
    }
    
    void useofThrow(int age) throws Exception{
        if(age<18){
            throw new Exception();
        }
        else{
            System.out.println("You are allowed to enter");
        }
    }
    void useofThrow_And_Finally() {
    	 try {
             int b=0,a=8;
             int arr[]=new int[5];
             arr[5]=a/b;
         }
         catch(ArithmeticException e)
         {
         	System.out.println("division by zero");
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
    	 finally
    	 {
    		 System.out.println("Always executed");
    	 }
    }

}
public class P12_Task01_ExceptionHanding {


    public static void main(String args[]) throws Exception {
        exception obj=new exception();
//      obj.basicException();// Exception arise
        obj.handleException();
        obj.multipleCatch();
//      obj.inputMinsmatchException();
//      obj.stackOverFlowError(2);// stack overflow error
        obj.indexOutofBoundException();
        obj.nullPointerException();
//      obj.useofThrow(12);// handled by jvm as we use throws
        obj.useofThrow_And_Finally();
    }
}