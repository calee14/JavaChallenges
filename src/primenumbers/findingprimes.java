package primenumbers;

public class findingprimes {
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		} else if(num <= 3) {
			return true;
		} else if(num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		int i = 5;
		while(i * i <= num) {
			if(num % i == 0 || num % (i+2) == 0) {
				return false;
			}
			i += 6;
		}
		return true;
	}
	public static int findPrime(int num) {
		int i = 0;
		int count = 0;
		while(true) {
			if(isPrime(i)) {
				count += 1;
				if(count == num) {
					return i;
				}
			}
			i += 1;
		}
	}
	public static void main(String[] arg) {
		long startTime = System.nanoTime();
		System.out.println(findPrime(10001));
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
		
	}
}
