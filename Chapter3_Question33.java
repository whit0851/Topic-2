import java.util.*;
public class Chapter3_Question33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		
			double weight1 = input.nextDouble();
			double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		
			double weight2 = input.nextDouble();
			double price2 = input.nextDouble();
			input.close();
	
	double ppp1 = price1 / weight1;
	double ppp2 = price2 / weight2;
	
	if (ppp1 < ppp2)
		System.out.print("Package 1 has a better price.");
	else if (ppp1 > ppp2)
		System.out.print("Package 2 has a better price.");
	else if (ppp1 == ppp2)
		System.out.print("The two packages have the same price.");
	else
		System.out.print("Error");
	}

}
