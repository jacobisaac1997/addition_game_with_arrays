import java.util.Scanner;
public class addition_game_and_arrays {

	public static void main(String[] args) {
		additionGameMethod();
	}
	public static void additionGameMethod(){
		
		int[] gameVariables= new int[3];
		gameVariables[0] = 10;//hardness
		gameVariables[1] = 2;//make hardness lower
		gameVariables[2] = 0;//check if user is correct
		int score = 0;
		for(int round = 0; round<4; round++){
			answerCheck(gameVariables);
			if(gameVariables[2] == 1){
				gameVariables[0] =  gameVariables[0] * gameVariables[1];
				score = score + 10;
				System.out.print("Your score is now ");
				System.out.println(score);
				System.out.println("And you have gone up to the next level of hardness.");
			}
			if(gameVariables[2] == 0){
				if(gameVariables[0] == 10){
					System.out.println("As you got the question wrong your hardness did not increase.");
				}
				else{
					gameVariables[0] = gameVariables[0] / gameVariables[1]; 
				}
			}
		}
		System.out.print("Thank you for playing, your score was ");
		System.out.print(score);
	}
	public static int[] answerCheck(int[] gameVariables){
	int n1 = (int)(Math.random()*gameVariables[0]);
	int n2 = (int)(Math.random()*gameVariables[0]);
	
	System.out.println("What is " + n1 + " + " + n2 + " ?");
	
	int correctAnswer = (n1 + n2);
	Scanner input = new Scanner(System.in);
	
	int userAnswer = input.nextInt();
	
	if(userAnswer == correctAnswer){
		System.out.println("That was correct.");
		gameVariables[2] = 1;
	}
	else{
		System.out.print("That was not the correct answer as it was " + correctAnswer);
	}
	
	return gameVariables;
	}
}