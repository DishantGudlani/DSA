class Knapsack
{

static int min(int a, int b)
{
return (a < b) ? a : b;
}

static int knapsack(int sum, int[] wt, int n)
{
	int K[][] = new int[n + 1][sum + 1]; 
	
	//initialization
	for(int j = 0; j <= sum; j++)
	{
		K[0][j] = Integer.MAX_VALUE - 1;
	}
	
	for(int i = 1; i <= n; i++)
	{
		K[i][0] = 0;
	}
	
	//2nd row initialization
	for(int j = 1; j <= sum; j++)
	{
		if(j % wt[0] == 0)
			K[1][j] = j / wt[0];
		
		else
			K[1][j] = Integer.MAX_VALUE - 1;
	
	}
  
        // Build table K[][] in bottom up manner 
        for (int i = 2; i <= n; i++) 
		{ 
            for (int j = 1; j <= sum; j++) 
			{ 
                if(wt[i - 1] <= j)
					K[i][j] = min(K[i][j - wt[i - 1]] + 1, K[i - 1][j]);
				
				else
					K[i][j] = K[i - 1][j];
					
            } 
        } 
  
        return K[n][sum]; 
	
}

public static void main(String[] args)
{
	
	int[] coin = new int[] {1,2,3};
	int sum = 5, n = coin.length;

	System.out.println(knapsack(sum, coin, n));
}
}