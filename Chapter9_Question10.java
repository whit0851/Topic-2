import java.util.*;
public class Chapter9_Question10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value for a, b, and c: ");
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		input.close();
		QE newRoots = new QE(A, B, C);
		
		if(newRoots.getDiscriminant()==0)
			System.out.print("There is only one root and it is: " + newRoots.getr1());
		else
			System.out.print("The quadratic roots are r1 = " + newRoots.getr1() + " and r2 = " + newRoots.getr2());
	}

}

class QE{
	private double a, b, c;
	
	QE(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	double geta(){
		return a;
	}
	double getb(){
		return b;
	}
	double getc(){
		return c;
	}
	double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	double getr1(){
		if(b * b - 4 * a * c < 0)
			return 0;
		else
			return (- b + Math.pow((b * b - 4 * a * c), .5))/(2*a);
	}
	double getr2(){
		if(b * b - 4 * a * c < 0)
			return 0;
		else
			return (- b - Math.pow((b * b - 4 * a * c), .5))/(2*a);
	}
}