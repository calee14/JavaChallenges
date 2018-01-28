package palindrome;

public class findpalindromes {
	public static int reverseint(int num) {
		String str = Integer.toString(num);
		String reverse = "";
	    int length = str.length();
	    for( int i = length - 1 ; i >= 0 ; i-- ) {
	       reverse = reverse + str.charAt(i);
	    }
	    int reversedint = Integer.parseInt(reverse);
	    return reversedint;
	}
	public static boolean checkpalindrome(int num) {
		if(num == reverseint(num)) {
			return true;
		}
		return false;
	}
	public static int findlargestpalindrome(int digits1, int digits2) {
		int max = 0;
		for(int i=digits1; i<digits2;i++) {
			for(int j=digits1; j<digits2;j++) {
				int p = i * j;
				if(checkpalindrome(p) && p > max) {
					max = p;
				}
			}
		}
		return max;
	}
	public static void main(String[] arg) {
		System.out.println(findlargestpalindrome(100,999));
	}
}
