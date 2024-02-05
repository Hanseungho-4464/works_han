package works_han;

public class Fibonacci {
	public static void main(String...args) {
		System.out.println("Fibonacci 5번째 값은 " + fibonacci(5));
	}
	public static int fibonacci(int param) {
		if(param == 1 || param == 2) {
			return 1;
		} else {
			return fibonacci(param - 1) + fibonacci(param - 2);
		}
	}
}
