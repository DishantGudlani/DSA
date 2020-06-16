


class Xyz
{
	public static void main(String[] args)
	{
		
		int[] arr = {2,3,5,6,8,10};
		
		int n = arr.length;
		int sum = 10;
		
		
		
		System.out.println(subsetSum(arr, n, sum));
		
				
		
		
				
	}
	
	static int subsetSum(int[] arr, int n, int sum)
	{
		
		int[][] bu = new int[n + 1][sum + 1];
		
		for(int j = 0; j <= sum; j++)
			bu[0][j] = 0;
		
		for(int i = 0; i <= n; i++)
			bu[i][0] = 1;
		
				// Build table K[][] in bottom up manner 
				for (int i = 1; i <= n; i++) 
				{ 
					for(int j = 1; j <= sum; j++)
					{
						if (arr[i - 1] <= j) 
							bu[i][j] = (bu[i - 1][j - arr[i - 1]]) + (bu[i - 1][j]); 
						else
							bu[i][j] = bu[i - 1][j]; 
					}
					
				} 
				
				return bu[n][sum];
	}
}