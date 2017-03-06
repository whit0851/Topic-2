import java.util.*;
public class Chapter3_Question5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: \n");
		
		int today = input.nextInt();
		input.nextLine();
		System.out.print("Enter the number of days elapsed since today: \n");
		int a = input.nextInt();
		input.nextLine();
		int future = today + a;
		String bill;
		input.close();
		if(today == 0)
			bill = "Sunday";
		else if (today == 1)
			bill = "Monday";
		else if (today == 2)
			bill = "Tuesday";
		else if (today == 3)
			bill = "Wednesday";
		else if (today == 4)
			bill = "Thursday";
		else if (today == 5)
			bill = "Friday";
		else
			bill = "Saturday";
		
		switch (future % 7) {
			case 0: System.out.println("Today is " + bill + " and the future day is Sunday"); break;
			case 1: System.out.println("Today is " + bill + " and the future day is Monday"); break;
			case 2: System.out.println("Today is " + bill + " and the future day is Tuesday"); break;
			case 3: System.out.println("Today is " + bill + " and the future day is Wednesday"); break;
			case 4: System.out.println("Today is " + bill + " and the future day is Thursday"); break;
			case 5: System.out.println("Today is " + bill + " and the future day is Friday"); break;
			case 6: System.out.println("Today is " + bill + " and the future day is Saturday"); break;
			
		}
	}

}
