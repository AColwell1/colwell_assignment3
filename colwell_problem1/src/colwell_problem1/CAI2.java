package colwell_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {
	
	private int answer, input_answer, num1, num2;
	
	SecureRandom random = new SecureRandom();
	Scanner input = new Scanner(System.in);
	
	public CAI2() {
		num1 = random.nextInt(9) + 1;
		num2 = random.nextInt(9) + 1;
	}
	
	public static void main(String[] args) {
		CAI2 app = new CAI2();
		app.quiz();
		
	}
	
	public void quiz() {
		answer = num1 * num2;
		askQuestion();
	}
	
	public void askQuestion(){
		System.out.printf("How much is %d times %d?", num1, num2);
		readResponse();		
	}
	
	public void readResponse() {
		input_answer = input.nextInt();
		isAnswerCorrect();
	}
	
	public void isAnswerCorrect() {
		if(answer == input_answer)
			displayCorrectResponse();
		else
			displayIncorrectResponse();
	}
	
	public int displayCorrectResponse() {
		switch(random.nextInt(4) + 1) {
			case 1: 
				System.out.println("Very good!"); break;
			case 2:
				System.out.println("Excellent!"); break;
			case 3:
				System.out.println("Nice work!"); break;
			case 4:
				System.out.println("Keep up the good work!"); break;
		}
		input.close();
		return 0;
	}
	
	public void displayIncorrectResponse() {
		switch(random.nextInt(4) + 1) {
			case 1: 
				System.out.println("No. Please try again."); break;
			case 2:
				System.out.println("Wrong. Try once more."); break;
			case 3:
				System.out.println("Don’t give up!"); break;
			case 4:
				System.out.println("No. Keep trying."); break;
	}
		askQuestion();
	}
	
}