package sumofprimes;

public class sumprimes {
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
	public static long sumofprime(int num) {
		long primes = 0;
		for(int i=0;i<num;i++) {
			if(isPrime(i)) {
				primes += i;
			}
		}
		return primes;
	}
	public static void main(String[] arg) {
		long startTime = System.nanoTime();
		System.out.println(sumofprime(2000000));
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
	}
}
