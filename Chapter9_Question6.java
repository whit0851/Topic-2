public class Chapter9_Question6 {

	public static void main(String[] args) {
		double [] numbers = new double[100000];
		int i = 0;
		while (i<100000){
			numbers[i] = (double)(Math.random()*1000000);
			i++;
		}
		
		Stopwatch time = new Stopwatch();
		time.start();
		
		for (int k = 0; k < numbers.length - 1; k++) {
		// Find the minimum in the list[k..list.length-1]
			double currentMin = numbers[k];
			int currentMinIndex = k;
				
				 for (int j = k + 1; j < numbers.length; j++) {
					 if (currentMin > numbers[j]) {
				 currentMin = numbers[j];
				 currentMinIndex = j;
				 }
				 }
				
				 // Swap list[k] with list[currentMinIndex] if necessary
				if (currentMinIndex != k) {
				 numbers[currentMinIndex] = numbers[k];
				 numbers[k] = currentMin;
		
				}
			}
		time.stop();
		System.out.print("Time elapsed while sort was " + time.getElapsedTime() + " milliseconds.");
		}
}

		class Stopwatch{
			private double startTime;
			private double endTime;
				
			Stopwatch(){
				startTime=System.currentTimeMillis();
			}
			
			double start(){
				return startTime=System.currentTimeMillis();
			}
			double stop(){
				return endTime=System.currentTimeMillis();
			}
			double getElapsedTime(){
				return endTime-startTime;
			}
		
		}
