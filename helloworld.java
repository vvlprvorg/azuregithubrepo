import java.util.Scanner; 
class helloworld
{
	public static void main(String[] args)
	{
		int a=5, b=10, c, i;
		System.out.println("Hi Ramesh, never stop learning");
		for(i=0; i<5; i++);
		{
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter first number: ");
			a = myObj.nextInt();
			System.out.println("Type another number:");
			b = myObj.nextInt(); // Read user input
			c = a + b;
			System.out.println("Sum value is " +c);
		}
	}
}
