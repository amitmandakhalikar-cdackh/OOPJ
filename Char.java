//   5)Write a program that takes a character as input and determines whether it’s a vowel or a consonant using if-else.


import java.util.Scanner;
  
 class Char{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter a charctaer to print its Vower OR Cpnsonant");
		char choice=sc.next().charAt(0);
		System.out.println("-----------------------");
		
		if(choice=='a' || choice=='e' || choice=='i'|| choice=='o' || choice=='u' )
		{
				System.out.println(" Its Vowel : "+choice);
		}
		else{
				System.out.println("Its Consonant: "+choice);
		}
	
	}
 }