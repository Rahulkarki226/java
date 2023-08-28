package Unit_03;
class VotingAgeException extends Exception
{
	public VotingAgeException(String message)
	{
		super(message);
	}
}
class person 
{
	private int age;
	public person(int age)
	{
		this.age=age;
	}
	public void fun() throws VotingAgeException
	{
		if(age<18)
		{
			throw new VotingAgeException("you are not eligeble");
		}
		else
		{
			System.out.println("you are eligeble");
		}
		
	}
}
public class rahul {
	public static void main(String args[])
	{
		person a= new person(14);
		try {
			a.fun();
		}
		catch( VotingAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
