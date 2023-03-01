// Recursive implementation of Fibonacci Series

class Fibonacci{

	// Function to print the fibonacci series
	static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n - 1)
			+ fib(n - 2);
	}

	  public static void main(String args[])
	{
   int c = 10;
		for (int i = 0; i < c; i++) {

			System.out.print(fib(i) + " ");
		}
	}
}

