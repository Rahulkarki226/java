package Unit_02;

class Animal
{
	void survive()
	{
		System.out.println("survival of the fittest");
	}
}
class Mammal extends Animal
{
	void baby()
	{
		System.out.println("Mammels produce baby");
	}
	void future()
	{
		survive();
	}
}
public class P8_Task01_InheritanceInJava {
      public static void main(String args[])
      {
    	  Animal dog=new Animal();
    	  dog.survive();    	  
      }
}
