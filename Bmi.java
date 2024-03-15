//    6)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories  
//           (underweight, normal weight, overweight, etc.).
// weight / heigh ^2

import java.util.Scanner;

class Bmi
{
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter ur weight ");
		double wt=sc.nextInt();

		System.out.println("Enter ur height ");
		double ht=sc.nextInt();
		
		double res=(wt/(ht*ht)) *10000;
		
		System.out.println("-----------------------");
		if(res <=17)
		{
				System.out.println("U r Underweight");
		}
		else if( res >17 && res <=25)
		{
			System.out.println("U r Normal");
		}
		else if( res >25 && res <=30)
		{
			System.out.println("U r Over Weighted");
		}
		else if( res >30)
		{
			System.out.println("U r Over Obeses");
		}
	}
}