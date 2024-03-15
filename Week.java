//            4)Write a program that takes a number representing a weekday (1-7) and prints the name of the weekday using switch-case.  

 import java.util.Scanner;
  
 class Week{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter no from ( 1-7 ) ");
		int choice=sc.nextInt();
		System.out.println("-----------------------");
		switch(choice)
		{
			case 1:
						System.out.println("Monday");
						break;
			case 2:
						System.out.println("Tuesday");
						break;
			case 3:
						System.out.println("Wednesday");
						break;
			case 4:
						System.out.println("Thursday");
						break;
			case 5:
						System.out.println("Friday");
						break;
			case 6:
						System.out.println("Saturday");
						break;
			case 7:
						System.out.println("Sunday");
						break;
			default:
						System.out.println(" Wrong choice : enter nos from ( 1-7 )");
						break;
		}
	
	}
 }