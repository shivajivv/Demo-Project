package classes;

public class Calculator {

	public static void main(String[] args) {
		
	}
	
	public int add(int a,int b)
	{
		int result = a+b;
		System.out.println("Addition = "+result);
		return result;
	}
	public int sub(int a, int b)
	{
		int result = a-b;
		System.out.println("Subtraction = "+result);
		return result;
	}
	public int mul(int a, int b)
	{
		int result = a*b;
		System.out.println("Multiplication = "+result);
		return result;
	}
	public int div(int a, int b)
	{
		int result = a/b;
		System.out.println("Division = "+result);
		return result;
	}

}
