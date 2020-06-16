


class Xyz
{
	public static void main(String[] args)
	{
		
		int[] arr = {1,5,9,11};
		
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<n; i++)
			sum += arr[i];
		
		if(sum % 2 != 0)
			System.out.println(false);
		
		else
			System.out.println(subsetSum(arr, n, sum/2));
		
				
		
		
				
	}
	
	static boolean subsetSum(int[] arr, int n, int sum)
	{
		
		boolean[][] bu = new boolean[n + 1][sum + 1];
		
		for(int j = 0; j <= sum; j++)
			bu[0][j] = false;
		
		for(int i = 0; i <= n; i++)
			bu[i][0] = true;
		
				// Build table K[][] in bottom up manner 
				for (int i = 1; i <= n; i++) 
				{ 
					for(int j = 1; j <= sum; j++)
					{
						if (arr[i - 1] <= j) 
							bu[i][j] = (bu[i - 1][j - arr[i - 1]]) || (bu[i - 1][j]); 
						else
							bu[i][j] = bu[i - 1][j]; 
					}
					
				} 
				
				return bu[n][sum];
	}
}