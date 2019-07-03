import java.util.Scanner;
public class lab6 {


	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");

		Scanner scan = new Scanner(System.in);
		String userChoice;
		int m = 1;
		do {
		System.out.println("How many sides should each dice have?");
		String answer = scan.nextLine();
		int n = Integer.parseInt(answer);

			int dice1 = generateRandomDieRoll(n);
			int dice2 = generateRandomDieRoll(n);

			System.out.println("Roll" + " " + m + ": " + " \n" + dice1 + " \n" + dice2);
		
		System.out.println("Roll again?(y/n:)");

			userChoice = scan.nextLine();
			m = m + 1;
		
		} while (userChoice.equals("y"));
		
			 System.out.println("Good Bye"); 
			 scan.close(); }

	public static int generateRandomDieRoll(int n) {

		int dice = (int) (Math.random() * n + 1);
		return dice;

	}
	}
