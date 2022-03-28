package coreJava;
import java.util.*;

public class CustomizedException {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age...");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		
		if(age<18)
		{
			
		}
		else
		{
			System.out.println("You can vote...");
		}
	
	}
	
}
//Exception Class
class CantVote extends Exception//checked Exception
{
	CantVote(String msg)
	{
		//super(msg);
		
	}	
		
}
