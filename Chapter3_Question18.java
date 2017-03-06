import java.util.*;

public class Chapter3_Question18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter the weight of the package: \n");
		double weight = input.nextDouble();
		input.close();
		if (weight <= 1)
			 System.out.print("The weight of the package is " + weight + " pounds and the cost is $3.50.");
		else if (1 < weight && weight <= 3)
			System.out.print("The weight of the package is " + weight + " pounds and the cost is $5.50.");
		else if (3 < weight && weight <= 10)
			System.out.print("The weight of the package is " + weight + " pounds and the cost is $8.50.");
		else if (10 < weight && weight <= 20)
			System.out.print("The weight of the package is " + weight + " pounds and the cost is $10.50.");
		else if (20 < weight && weight <= 50)
			System.out.print("The weight of the package is " + weight + " pounds and the cost is $15.50.");
		else
			 System.out.print("The package with a weight of " + weight + " pounds is to heavy to ship.");

	}

}
