package pythagoreantriplet;

public class pythagoreantrip {
	public static long findtrip(int num) {
		for(int a=0;a<num / 3;a++) {
			for(int b=0;b<num / 2;b++) {
				double c = Math.sqrt((double)((a*a)+(b*b)));
				if(a+b+c == num) {
					double product = a*b*c;
					System.out.println("a: " + a + " b: " + b + " c: " + c);
					System.out.println(Double.valueOf(product).longValue());
					break;
				}
			}
		}
		return 0;
	}
	public static void main(String[] arg) {
		long startTime = System.nanoTime();
		findtrip(1000);
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
	}
}
