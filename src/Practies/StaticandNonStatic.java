package Practies;

public class StaticandNonStatic {
	public static void Display()
	{
		System.out.println("Hello wrold");
	}
	public void Display1()
	{
		System.out.println("How was the weather");
	}
	public static void main(String arg[])
	{
		StaticandNonStatic obj=new StaticandNonStatic();
		obj.Display1();
		Display();
	}

}
