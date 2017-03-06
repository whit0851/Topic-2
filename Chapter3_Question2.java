import java.util.*;
public class Chapter3_Question2 {

	public static void main(String[] args) {
		int x1 = (int)(Math.random() * 10);
		int x2 = (int)(Math.random() * 15);
		int x3 = (int)(Math.random() * 27);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + x1 + " + " + x2 + " + " + x3 + "?\n" );
		
		int x4 = input.nextInt();
		
		input.close();
		
		System.out.print(x1 + " + " + x2 + " + " + x3 + " = " + x4 + " is " + (x1 + x2 + x3 == x4));
	}

}
