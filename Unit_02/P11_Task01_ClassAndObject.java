package Unit_02;

class TelCall
{
	long  phno;
	String Sname;
	int n;
	double amt;
	TelCall(String Sname,long phno,int n)
	{
		this.phno=phno;
		this.Sname=Sname;
		this.n=n;
		this.amt=0;
	}
	void compute()
	{
		if(n>300)
		{
			amt+=(n-300)*1.50;
			n=300;
		}
		if(n>200)
		{
			amt+=(n-200)*1.20;
			n=200;
		}
		if(n>100)
		{
			amt+=(n-100)*1;
			n=100;
			
		}
		if(n>0)
		{
			amt+=500;
		}
	}
	void display()
	{
		System.out.println("Name:"+this.Sname);
		System.out.println("PNo:"+this.phno);
		System.out.println("Total Bill:"+this.amt);
	}
}

public class P11_Task01_ClassAndObject {
	public static void main(String[] args) {
		TelCall customer=new TelCall("janki devi",7900655894L,378);
		customer.compute();
		customer.display();
		
	}

}
