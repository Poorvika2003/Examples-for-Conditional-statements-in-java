Login Validation using Nested if

class Login Validation
{
	public static void main(String[] args)
	{
		String id = "Admin";
		int password = 789;
		if (id == "Admin")
		{
			system.out.println("User id is valid");
			system.out.println("Enter the password");
			if( password == 789)
			{
				system.out.println("Password is valid");
				system.out.println("Login successful");
			}
			else
			{
				system.out.println("Password is invalid");
				system.out.println("Login Unsuccessful");
			}
		}
		else
		{
			system.out.println("User id invalid");
			system.out.println("Login Unsuccessful");
		}
	}
}