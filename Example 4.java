Example 4: Grade validation


class GradeValidation
{
	public static void main(String[] args)
	{
		char grade = 'C';
		switch(grade);
		{
			case 'A': system.out.println("Excellent");
				  break;
			case 'B': system.out.println("Good");
				  break;
			case 'C': system.out.println("Bad -> Fail");
				  break;
			default: system.out.println("Invalid");
		}
	}
}
			
