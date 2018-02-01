package primefactors;
import java.util.*;

public class largestprimefactor {
	public static List<Integer> findprimefactors(long primeNum) {
		List<Integer> factors = new ArrayList<>();
		int num = 2;
		while(num * num < primeNum) {
			while(primeNum % num == 0) {
				primeNum /= num;
				factors.add(num);
			}
			num += 1;
		}
		return factors;	
	}
	public static int getlargestfactor(List<Integer> nums) {
		int max = 0;
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long value = 600851475143L;
		List<Integer> num = findprimefactors(value);
		System.out.println(getlargestfactor(num));
		long endTime   = System.nanoTime();
		long totalTimeMS = (endTime - startTime) / 1000000;
		System.out.println("Program took " + totalTimeMS + " ms");
		
	}
}
