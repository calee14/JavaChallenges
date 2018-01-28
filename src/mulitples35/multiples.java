package mulitples35;

public class multiples {
	public static int getmultiples(int num1, int num2) {
		int multi3 = num1;
		int multi5 = num2;
		int total3 = 0;
		int total5 = 0;
		for(int i=0; i<1000;i+=multi3) {
			total3 += i;
		}
		for(int j=0; j<1000; j+=multi5) {
			total5 += j;
		}
		return total3 + total5;
	}
	public static void main(String[] args) {
		System.out.println(getmultiples(3, 5));
		
	}
}
