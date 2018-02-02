package smallestmultiple;
import java.util.*;

public class smallmultiples {
	public static List<Integer> finddivisibility(int upperLimit) {
		List<Integer> primes = new ArrayList<>();
		boolean isPrime;
		int j;
		
		primes.add(2);
		
		for (int i=3; i<=upperLimit;i+=2) {
			j = 0;
			isPrime = true;
			while (primes.get(j)*primes.get(j) <= i) {
				if(i % primes.get(j) == 0) {
					isPrime = false;
					break;
				}
				j++;
			}
			if(isPrime) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int divisorMax = 20;
		List<Integer> p = finddivisibility(divisorMax);
		int result = 1;
		
		for(int i=0; i<p.size(); i++) {
			int a = (int) Math.floor(Math.log(divisorMax) / Math.log(p.get(i)));
			result = result * ((int)Math.pow(p.get(i), a));
		}
		System.out.println(result);
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
	}
}
