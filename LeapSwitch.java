	import java.util.Scanner;
	
class LeapSwitch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter a yr to find its Leap OR Not");
	int yr=sc.nextInt();
	System.out.println("--------------------");
	
	switch(1)
	{
		case 1:
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
			  break;
	 default : System.out.println("Not leap yr");
	}
	}
	
}