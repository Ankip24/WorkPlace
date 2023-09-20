package Java;
class Abc{
	public static void Sum1(int a,int b) {
		int c = a + b;
		System.out.println("Sum"+c);
	}
}
public class Mutli extends Abc {
	
	public static void main(String arg[])
	{
		Abc obj=new Abc();
		Sum1(2,5);
		
	}

}

