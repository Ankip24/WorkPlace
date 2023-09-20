package Practies;
 class A
{
	 public void Display()
	 {
		System.out.println("I am"); 
	 }
	 public static void Display1()
	 {
		 System.out.println("Ankita"); 
	 }
	}
public class TwoClassusingStaticandNonStatic {
	public static void  main(String arg[])
	{
		A obj=new A();
		obj.Display();
		A.Display1();
	}
	

}


