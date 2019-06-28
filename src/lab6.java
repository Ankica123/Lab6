import java.util.Scanner;
public class lab6 {


	public static void main(String[] args) {
		// Call the method
		generateRandomDieRoll();


	}

	public static void generateRandomDieRoll() {
		System.out.println("Welcome to the Grand Circus Casino!");
		{
		}
		Scanner scan = new Scanner(System.in);
		String userChoice;
		int m = 1;
		do {
		System.out.println("How many sides should each dice have?");
		String answer = scan.nextLine();
		int n = Integer.parseInt(answer);

		int dice1 = (int) (Math.random() * n + 1);
		int dice2 = (int) (Math.random() * n + 1);
			System.out.println("Roll" + " " + m + ": " + " \n" + dice1 + " \n" + dice2);
		
		System.out.println("Roll again?(y/n:)");

			userChoice = scan.nextLine();
			m = m + 1;
		
		} while (userChoice.equals("y"));
		
			 System.out.println("Good Bye"); 
			 scan.close(); }
	}
