import java.util.*;

public class Chapter3_Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): \n");
		int userC = input.nextInt();
		input.nextLine();
		input.close();
		int comp = (int)(Math.random() * 3);
		
		if(userC==0){
			if(comp == 0)
				System.out.print("The computer is scissor. You are scissor too. It is a draw");
			else if (comp == 1)
				System.out.print("The computer is rock. You are scissor. You lost");
			else 
				System.out.print("The computer is paper. You are scissor. You won");
			}
		else if(userC == 1){
			if(comp == 0)
				System.out.print("The computer is scissor. You are rock. You won");
			else if (comp == 1)
				System.out.print("The computer is rock. You are rock too. It is a draw");
			else 
				System.out.print("The computer is paper. You are rock. You lost");
		}
		else if(userC == 2){
			if(comp == 0)
				System.out.print("The computer is scissor. You are paper. You lost");
			else if (comp == 1)
				System.out.print("The computer is rock. You are paper. You won");
			else 
				System.out.print("The computer is paper. You are paper too. It is a draw");
		}
		else
			System.out.print("Please pick a different number.");
	}

}
