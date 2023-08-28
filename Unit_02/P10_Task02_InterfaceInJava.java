package Unit_02;

//P10_Task02_InterfaceInJava.java
//- Create two interfaces Animal and Human 
//- Animal contains animalSound() and run1(), public and void methods
//- Human contains humanSound() and run2(), public and void methods
//- Create a class name Species which implements these two interfaces
//- Illustrate how multiple inheritance feature can be achieved through multiple interfaces
interface Animal2
{
	 void animalSound();
      void run1();
}
interface Human
{
	 void humanSound();
     void run2();
}
class Species implements Animal2,Human
{
	protected int a = 1;
	public void animalSound()
	{
		System.out.println("aaawwww");
	}
	public void run1()
	{
		System.out.println("two legs");
	}
	public void humanSound()
	{
		System.out.println("talking");
	}
	 public void run2()
	{
		System.out.println("four legs");
	}
}


public class P10_Task02_InterfaceInJava {
  public static void main(String[] args) {
	   Species speciesObj = new Species();
       
       speciesObj.animalSound();
       speciesObj.run1();
       speciesObj.humanSound();
       speciesObj.run2();
}
}
