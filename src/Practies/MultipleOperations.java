package Practies;

public class MultipleOperations {
	int a=10;
	int b=5;
	public void add()
	{
		int c=(a+b);
		System.out.println(c);
	}
	public void sub()
	{
		int d=(a-b);
		System.out.println(d);
	}
	public void mul()
	{
		int e=(a*b);
		System.out.println(e);
	}
	public void div()
	{
		int j=(a/b);
		System.out.println(j);
			
	}
public static void mian(String arg[])
	{
	MultipleOperations m=new MultipleOperations();
	m.add();
	m.sub();
	m.mul();
	m.div();
	}
}
