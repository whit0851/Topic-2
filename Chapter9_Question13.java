import java.util.*;
public class Chapter9_Question13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Location Location1 = new Location();
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
	
		int column = input.nextInt();
		
		System.out.print("Enter the array: \n");
		double [][] a = new double [row][column];
		
		for (int i =0; i < row; i++)
			for(int j = 0; j < column; j++)
				a[i][j]=input.nextDouble();
		
		input.close();
	
		for (int i = 0; i < row; i++)
			for(int j = 0; j < column; j++)
				if(a[i][j]>Location1.getmaxvalue()){
					Location1.setrow(i); 
					Location1.setcolumn(j);
					Location1.setmaxvalue(a[i][j]);
				}
	System.out.print("The location of the largest element is " + Location1.getmaxvalue() + " at (" + Location1.getrow() + ", " + Location1.getcolumn() + ")");
	}
}

class Location{
	private int row;
	private int column;
	private double maxvalue;
	
	Location(){
		maxvalue=0;	
		row = 0;
		column = 0;
	}
	public void setrow(int newrow){
		row = newrow;
	}
	int getrow(){
		return row;
	}
	public void setcolumn(int newcolumn){
		column = newcolumn;
	}
	int getcolumn(){
		return column;
	}
	public void setmaxvalue(double newmaxvalue){
		maxvalue = newmaxvalue;
	}
	double getmaxvalue(){
		return maxvalue;
	}
	
	
}