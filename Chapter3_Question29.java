import java.util.*;

public class Chapter3_Question29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double Cx1 = input.nextDouble();
		double Cy1 = input.nextDouble();
		double Cr1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double Cx2 = input.nextDouble();
		double Cy2 = input.nextDouble();
		double Cr2 = input.nextDouble();
		input.close();
		
		double distance = (Math.pow(Math.pow(Cx1-Cx2, 2) + Math.pow(Cy2-Cy1, 2) , .5) );
		double rdistance = Math.pow(Math.pow(Cr1-Cr2, 2) , .5);		

		if (distance <= rdistance)
			System.out.print("Circle2 is inside circle1.");
		else if (distance <= Cr1 + Cr2)
			System.out.print("Circle2 overlaps circle1.");
		else
			System.out.print("Circle2 does not overlap circle1.");
	}

}
