package fibonacci;

public class fibonnacci {
	public static int findfib(int term) {
		int num1 = 1;
		int num2 = 0;
		for(int i=0; i<term; i++) {
			int temp = num1;
			num1 += num2;
			num2 = temp;
		}
		return num1;
	}
	public static int getevenfib(int max) {
		int num = 0;
		int even = 0;
		while(true) {
			if(num > 30) {
				break;
			}
			int fib = findfib(num);
			if(fib > max) {
				return even;
			}
			if(fib % 2 == 0) {
				even += fib;
			}
			num++;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.print(getevenfib(400000));
	}
}
