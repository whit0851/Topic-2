import java.util.*;

public class Chapter3_Question12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int rnumber=0;
		int tnumber;
		System.out.print("Enter a three-digit integer: \n");
		int number = input.nextInt();
		input.nextLine();
		input.close();
		int bill = number;
		
		while(number != 0){
			
			tnumber = number % 10;
			rnumber = rnumber * 10 + tnumber;
			number = number / 10;
	
			}	
		if (bill==rnumber)
			System.out.print(bill + " is a palindrome ");
		else
			System.out.print(bill + " is not a palindrome ");
	}

}
