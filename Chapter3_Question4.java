
public class Chapter3_Question4 {

	public static void main(String[] args) {
	
		int date = (int)(1 + Math.random() * 12);
	
		if(date == 1)
			System.out.print("The number generated was " + date + " and the month is January." );
		else if (date == 2)
			System.out.print("The number generated was " + date + " and the month is Februray." );	
		else if (date == 3)
			System.out.print("The number generated was " + date + " and the month is March." );	
		else if (date == 4)
			System.out.print("The number generated was " + date + " and the month is April." );
		else if (date == 5)
			System.out.print("The number generated was " + date + " and the month is May." );		
		else if (date == 6)
			System.out.print("The number generated was " + date + " and the month is June." );	
		else if (date == 7)
			System.out.print("The number generated was " + date + " and the month is July." );
		else if (date == 8)
			System.out.print("The number generated was " + date + " and the month is August." );
		else if (date == 9)
			System.out.print("The number generated was " + date + " and the month is September." );
		else if (date == 10)
			System.out.print("The number generated was " + date + " and the month is October." );
		else if (date == 11)
			System.out.print("The number generated was " + date + " and the month is November." );
		else
			System.out.print("The number generated was " + date + " and the month is December." );
	}

}
