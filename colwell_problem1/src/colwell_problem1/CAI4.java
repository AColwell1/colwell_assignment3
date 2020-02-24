package colwell_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI4 {
	
	private int answer, input_answer, num1, num2, i, correct, difflevel;
	
	SecureRandom random = new SecureRandom();
	Scanner input = new Scanner(System.in);
	
	public CAI4() {
		correct = 0;
		i = 0;
	}
	
	public static void main(String[] args) {
		CAI4 app = new CAI4();
		app.quiz();
		
	}
	
	public void quiz() {
		int x;
		i = 0;
		correct = 0;
		readDifficulty();
		while(i<10) {
			generateQuestionArgument();
			answer = num1 * num2;
			askQuestion();
			if(i == 10) {
				displayCompletionMessage();
				System.out.println("Would you like to try another problem set?\n1 Yes   2 No");
				x = input.nextInt();
				if(x == 1)
					quiz();
			}
		}
	}
	
	public void askQuestion(){
			System.out.printf("How much is %d times %d?", num1, num2);
			i++;
			readResponse();
			isAnswerCorrect();
			
	}
	
	public void readResponse() {
		input_answer = input.nextInt();
	}
	
	public void isAnswerCorrect() {
		if(answer == input_answer)
			displayCorrectResponse();
		else
			displayIncorrectResponse();
	}
	
	public void displayCorrectResponse() {
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
		correct++;
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
	}
	
	public void displayCompletionMessage() {
		System.out.printf("Score: %d%%\n", correct*10);
		if(correct >= 8)
			System.out.println("Congratulations, you are ready to go to the next level!");
		else
			System.out.println("Please ask your teacher for extra help");
	}
	
	public void readDifficulty() {
		System.out.println("Enter a level of difficulty: 1, 2, 3, 4");
		difflevel = input.nextInt();
	}
	
	public void generateQuestionArgument(){
		switch(difflevel) {
			case 1:
				num1 = random.nextInt(10);
				num2 = random.nextInt(10);
				break;
			case 2:
				num1 = random.nextInt(100);
				num2 = random.nextInt(100);
				break;
			case 3:
				num1 = random.nextInt(1000);
				num2 = random.nextInt(1000);
				break;
			case 4:
				num1 = random.nextInt(10000);
				num2 = random.nextInt(10000);
				break;
		}
	}
		
}