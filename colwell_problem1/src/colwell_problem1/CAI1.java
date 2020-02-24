package colwell_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {
	
	private int answer, input_answer, num1, num2;
	
	SecureRandom random = new SecureRandom();
	Scanner input = new Scanner(System.in);
	
	public CAI1() {
		num1 = random.nextInt(9) + 1;
		num2 = random.nextInt(9) + 1;
	}
	
	public static void main(String[] args) {
		CAI1 app = new CAI1();
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
		System.out.println("Very good!");
		input.close();
		return 0;
	}
	
	public void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
		askQuestion();
	}
	
}
