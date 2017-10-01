import java.util.Random;
import java.util.Scanner;
public class RockGame // Rock, Paper, Scissors Game by Heather Ventresco
{
	
	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		// 0=rock, 1=paper, 2=scissors
		int user, computer;
		
		System.out.println("Let's Play Rock, Paper, Scissors!");
		System.out.println("Ready, set, go!");
		System.out.println("Type 0 for rock, 1 for paper, and 2 for scissors:");
		
		user = input.nextInt();
		computer = random.nextInt(3);
		
        if (user < 0 || user > 2) //user input invalid number
        {      
            System.out.printf("Invalid number."); 
            System.exit(0);
        } 
        
        if (user == 0) //user chose rock
        {
        	if (computer == 0) //computer chose rock
        	{
        		System.out.printf("You chose rock\nComputer chose rock\nTie game!");
        	}
        	else if (computer == 1) //computer chose paper
        	{
        		System.out.printf("You chose rock\nComputer chose paper\nYou lose!");
        	}
        	else //computer chose scissors
        	{
        		System.out.printf("You chose rock\nComputer chose scissors\nYou win!");
        	}
        	System.exit(0);
        }
        
        if (user == 1) //user chose paper
        {
        	if (computer == 1) //computer chose paper
        	{
        		System.out.printf("You chose paper\nComputer chose paper\nTie game!");
        	}
        	else if (computer == 0) //computer chose rock
        	{
        		System.out.printf("You chose paper\nComputer chose rock\nYou win!");
        	}
        	else //computer chose scissors
        	{
        		System.out.printf("You chose paper\nComputer chose scissors\nYou lose!");
        	}	
        	System.exit(0);
        }
        
        if (user == 2) //user chose scissors
        {
        	if (computer == 2) //computer chose scissors
        	{
        		System.out.printf("You chose scissors\nComputer chose scissors\nTie game!");
        	}
        	else if (computer == 0) //computer chose rock
        	{
        		System.out.printf("You chose scissors\nComputer chose rock\nYou lose!");
        	}
        	else //computer chose paper
        	{
        		System.out.printf("You chose scissors\nComputer chose paper\nYou win!");
        	}	
        	System.exit(0);
        }
	}
}
        

	