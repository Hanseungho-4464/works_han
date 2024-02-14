package works_han;

public class Fibonacci {
	public static void main(String...args) {
		System.out.println("Fibonacci 5번째 값은 " + fibonacci(5));
	}
	/**
	 * 제귀 함수 개념
	 * f(x) = f(x-1) + f(x-2)
	 * 단, f(1) = 1, f(2) = 1
	 */
	public static int fibonacci(int param) {
		if(param == 1 || param == 2) {
			return 1;
		} else {
			return fibonacci(param - 1) + fibonacci(param - 2);
		}
	}
}
