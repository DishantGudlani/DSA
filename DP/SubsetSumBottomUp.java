class SubsetSum
{

public static void main(String[] args)
{
	int[] arr = new int[] {2,3,7,8,10};
	int sum = 11;
	int n = arr.length;
	
	boolean t[][] = new boolean[sum + 1][n+1]; 
	
	for (int i = 0; i <= n; i++) 
            t[0][i] = true;
			
	for (int i = 1; i <= sum; i++)  
            t[i][0] = false;
  
        for(int i = 1; i <= sum; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				t[i][j] = t[i][j - 1];
				if(i >= arr[j - 1])
				t[i][j] = t[i][j] || t[i - arr[j - 1]][j - 1];
			}
		}
				
  
        
	System.out.println(t[sum][n]);
}
}