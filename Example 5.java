Example 5: Largest of 3 numbers using if else if


class Largest of 3 nos
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 15;
		int c = 10;
		system.out.println("a :"+a+"b: "+b+"c: "+c);
		if (a > b && a > c)
		{
			system.out.println("a is largest");
		}
		else if (b > a && b > c)
		{
			system.out.println("b is largest");	
		}
		else(c > a && c > b)
		{
			system.out.println("c is largest");
		}
	}
}