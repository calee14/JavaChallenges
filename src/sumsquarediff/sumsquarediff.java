package sumsquarediff;

public class sumsquarediff {
	public static int sumsquare(int num) {
		int sum = 0;
		int square = 0;
		for(int i=0; i<num;i++) {
			sum += i;
			square += i*i;
		}
		return Math.abs(square-(sum*sum));
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(sumsquare(100));
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
	}
}
