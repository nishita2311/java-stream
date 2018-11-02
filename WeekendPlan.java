package dayOneHandson;

import java.util.Scanner;

public class WeekendPlan {

	public static void main(String[] args)
	{
		System.out.println("Here is the menu");
		System.out.println("Enter 1 for movies");
		System.out.println("Enter 2 for Shopping");
		System.out.println("Enter 3 for Eating out");
		System.out.println("Enter 4 for No plan");
		
		System.out.println("Enter your choice");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		s.close();
		/*if(choice==1)
		{
			System.out.println("Going for movie");
			
		}
		else if(choice==2)
		{
			System.out.println("Going for shopping");
		}
		else if(choice==3)
		{
			System.out.println("Eating out");
		}
		else if(choice==4)
		{
			System.out.println("No plan");
			
		}
		else
		{
			System.out.println("Invalid choice!!!");
		}*/
//s.close();
		switch(choice)
		{
		case 1:System.out.println("Going for movie");break;
		case 2:System.out.println("Going for shopping");break;
		case 3:System.out.println("Eating out");break;
		case 4:System.out.println("No plan");break;
		default:System.out.println("Invalid choice!!!");
		}
	}
}
