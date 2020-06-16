class Fibonacci { 
	
    static int fib(int n, int[] memo) 
    { 
        if (n <= 1) 
            return n; 
		if(memo[n] != 0)
			return memo[n];
		int result = fib(n - 1, memo) + fib(n - 2, memo);
		memo[n] = result;
        return result; 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 5; 
		int[] memo = new int[n+1];
		final long startTime = System.nanoTime();
        System.out.println(fib(n, memo)); 
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration/1000000);
    } 
} 