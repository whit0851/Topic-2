
public class Chapter9_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stock stock1 = new Stock("ORCL", "Oracle Corporation",34.5, 34.35 );
System.out.print("The " + stock1.Name + " with a symbol of, " + stock1.symbol + ", has a price-change percentage of " + stock1.getChangePercent() + " percent.");
	}
}

class Stock{
	String symbol;
	String Name;
	Double previousClosingPrice;
	Double currentPrice;
		
	Stock(String Newsymbol, String Newname, Double NewpreviousClosingPrice, Double NewcurrentPrice) {
		symbol = Newsymbol;
		Name = Newname;
		previousClosingPrice = NewpreviousClosingPrice;
		currentPrice= NewcurrentPrice;
	}
	
	double getChangePercent(){
		return (currentPrice-previousClosingPrice)/(previousClosingPrice)*100;
	}
}

		

