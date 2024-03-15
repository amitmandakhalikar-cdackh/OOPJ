   //

  // 3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as input and performs the operation using switch-case.
  
  import java.util.Scanner;
  
 class Cal{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter first no");
		int a=sc.nextInt();
		
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Enter choice from it ( +, - ,*, / ) ");
		String choice=sc.next();
		System.out.println("-----------------------");
		switch(choice)
		{
			case "+":
						System.out.println("Addition is: "+(a+b));
						break;
			case "-":
						System.out.println("Substraction is: "+(a-b));
						break;
			case "*":
						System.out.println("Multiplication is: "+(a*b));
						break;
			case "/":
						System.out.println("Division is: "+(a/b));
						break;
		}
	
	}
 }