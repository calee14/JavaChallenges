package mulitples35;

public class multiples {
	public static int getmultiples(int num1, int num2) {
		int sum = 0;
		for(int i=0; i<1000;i+=1) {
			if(i % num1 == 0 || i % num2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(getmultiples(3, 5));
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
	}
}
