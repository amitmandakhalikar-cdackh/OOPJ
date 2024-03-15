    // 2)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
	
	import java.util.Scanner;

public class Leap_If
{
	public static void main(String[] args)

	{
			Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter a yr to find its Leap OR Not");
	int yr=sc.nextInt();
	System.out.println("--------------------");
	if(yr%4==0)
	{
		if(yr%100==0)
		{
				if(yr%400==0)
			System.out.println("Leap yr");
		else
			System.out.println("Not leap yr");
		}
		else{
			System.out.println("Leap yr");
		}
	}
	else 
	{
		System.out.println("Not leap yr");
	}
	}
}