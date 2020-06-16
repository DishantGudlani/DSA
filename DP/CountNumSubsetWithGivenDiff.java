class Xyz
{
	public static void main(String[] args)
	{
		int[] arr = {1,1,2,3};
		int diff = 1;
		int len = arr.length;
		
		int sum = 0;
		for(int i = 0 ; i < len; i++)
		{
			sum += arr[i];
		}
		
		int sum_s1 = (sum + diff) / 2;
		
		
			
		
		System.out.println(countOfSubsetSum(arr, sum_s1, len));
		
		
	}
	
	public static int countOfSubsetSum(int[] arr, int sum, int n)
	{
		int[][] t = new int[n + 1][sum + 1];
		
		for(int j = 0; j <= sum; j++)
		{
			t[0][j] = 0;
		}
		
		for(int i = 0; i <= n; i++)
		{
			t[i][0] = 1;
		}
		
		for(int i = 1; i <= n ; i++)
		{
			for(int j = 1; j <= sum; j++)
			{
				if(arr[i - 1] <= j)
					t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
				
				else
					t[i][j] = t[i -1][j];
			}
		}
		
		return t[n][sum];
	}
}
	