


class Xyz
{
	public static void main(String[] args)
	{
		
		int[] arr = {2,3,7,8,10};
		int sum = 11;
		int n = arr.length;
		
		boolean[][] t = new boolean[n+1][sum+1] ;
		
		for(int j = 0; j <= sum; j++)
			t[0][j] = false;
		
		for(int i = 0; i <= n; i++)
			t[i][0] = true;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sum; j++)
			{
				if(arr[i - 1] <= j)
					t[i][j] = (t[i - 1][j - arr[i - 1]]) || (t[i - 1][j]);
				
				else if(arr[i - 1] > j)
					t[i][j] = t[i - 1][j];
			}
		}
		
		System.out.println(t[n][sum]);
	}
}