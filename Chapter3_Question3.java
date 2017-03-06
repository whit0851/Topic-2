import java.util.Scanner;
public class Chapter3_Question3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: \n");
		
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();
			double e = input.nextDouble();
			double f = input.nextDouble();
			input.close();
			double x;
			double y;
		if(a * d - b * c == 0) 
			System.out.print("The equation has no solution.");
		
		else {
			x =((e * d - b * f) / (a * d - b * c));
			
			y =((a * f - e * c) / (a * d - b * c));
		
			System.out.print("x = " + x + " and y = " + y);
		}

	}

}
