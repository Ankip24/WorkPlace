package Practies;

public class Mul {
	int a = 20;
	int b = 50;
	
	public void add ()
	{
		int c = (a+b);
		System.out.println(c);
	}
	
	public void sub ()
	{
		int d = (a-b);
		System.out.println(d);
	}
	
	public void multi ()
	{
		int e = (a*b);
		System.out.println(e);
	}
	
	public void div()
	{
		int f = (a/b);
		System.out.println(f);
	}
	
	public static void main (String [] args)
	{
	Mul r = new Mul ();
		r.add ();
		r.sub ();
		r.multi ();
		r.div ();
	}

}

