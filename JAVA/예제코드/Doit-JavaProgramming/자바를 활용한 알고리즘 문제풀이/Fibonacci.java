package ch07;

public class Fibonacci {
	int [] values;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		values = new int[number];
	}
	
	public int fibonacciRecur(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		
		
		return fibonacciRecur(n-1) + fibonacciRecur(n-2);
		
	}
	
	public int fibonacciIter(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		
		int ppre = 0;
		int pre = 1;
		int current = 0;
		
		for(int i=2; i<=n; i++) {
			current = ppre + pre;
			ppre = pre;
			pre = current;
		}
		
		return current;
	}
	
	public int fibonacciMem(int n) {
		
		if (n==0) return 0;
		if (n==1) return 1;
		
		values[0] = 0;
		values[1] = 1;
		
		
		
		for(int i=2; i<=n; i++) {
			values[i] = values[i-1] + values[i-2];
			
		}
		
		int result = values[n];
		
		return result;
	}
		
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci(100);
		
		System.out.println(f.fibonacciRecur(10));
		System.out.println(f.fibonacciIter(10));
		System.out.println(f.fibonacciMem(10));
	}

}
