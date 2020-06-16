class Knapsack
{

static int max(int a, int b)
{
return (a > b) ? a : b;
}

static int knapsack(int W, int[] wt, int[] val, int n)
{

//base condition for recursive,
if(n == 0 || W == 0)
	return 0;

if(wt[n-1] > W)
	return knapsack(W, wt, val, n - 1);

else
	return max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1),
			knapsack(W, wt, val, n - 1));
}

public static void main(String[] args)
{
	int[] val = new int[] {60,100,120};
	int[] wt = new int[] {10,20,30};
	int W = 50, n = val.length;

	System.out.println(knapsack(W, wt, val, n));
}
}