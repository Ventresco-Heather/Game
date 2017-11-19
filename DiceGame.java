import java.util.Scanner;  //Main Program by Heather Ventresco
public class DiceGame {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DiceClass diceObject = new DiceClass();  // creating the dice object
		
		System.out.println("Enter how many dice to roll? 1, 2, or 3");
		int user=input.nextInt(); //enter number of rolls and store in user
		
		
		System.out.println("Guess the points(1 die=1-6, 2 dice=2-12, 3 dice=3-18):");
		int guess=input.nextInt();  //user enters guess
		
		
		if (user == 1) {   // 1 dice
		diceObject.roll();  
		System.out.println("The computer rolled " +diceObject.Value1());
		if (guess == diceObject.Value1()) {
			System.out.println("You win");	
			}
		else {
			System.out.println("You lose");
		}
		}
		else if (user == 2){    // 2 dice
			diceObject.roll(); 
			System.out.println("The computer rolled " +diceObject.Value2());
			if (guess == diceObject.Value2()) {
				System.out.println("You win");	
				}
			else {
				System.out.println("You lose");
			}
		}
		else {        // 3 dice
			diceObject.roll(); 
			System.out.println("The computer rolled " +diceObject.Value3());
			if (guess == diceObject.Value3()) {
				System.out.println("You win");	
				}
			else {
				System.out.println("You lose");
			}
		}
	
		input.close();
	}
	
}
