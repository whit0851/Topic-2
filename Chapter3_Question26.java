import java.util.*;

public class Chapter3_Question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		input.close();
		
		System.out.print("Is " + integer + " divisible by 5 and 6? " + (integer % 5 == 0 && integer % 6 == 0) + "\n");
		System.out.print("Is " + integer + " divisible by 5 or 6? " + (integer % 5 == 0 || integer % 6 == 0) + "\n");
		System.out.print("Is " + integer + " divisible by 5 or 6, but not both? " + (integer % 5 == 0 ^ integer % 6 == 0) + "\n");
	}

}
