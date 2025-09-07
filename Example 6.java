Example 6: Largest of 3 Numbers using Nested if

class Largestofthreenum
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 15;
		int c = 10;
		system.out.println("a: "+a+"b: "+b+"c: "+c);
		if (a > b)
		{
			if (a > c)
			{
				system.out.println("a is largest");
			}
			else
			{
				system.out.println("c is largest");
			}
		else if( b > c)
		{
			system.out.println("b is largest");

		}
		else
		{
			system.out.println("c is largest");
		}
	}
}