import java.util.*;


class Xyz
{
	public static void main(String[] args)
	{
		int[] arr = {1,6,11,5};
		
		int len = arr.length;
		
		int sum = 0;
		for(int i = 0; i < len; i++)
		{
			sum += arr[i];
		}
		
		ArrayList<Integer> last_array = subsetSum(arr, sum, len);
		
		int mn = Integer.MAX_VALUE;
		
		for(int i = 0; i < last_array.size(); i++)
		{
			mn = Math.min(mn, sum - 2 * last_array.get(i));
		}
		
		System.out.println(mn);
	
		
		
		
		
	}
	
	public static ArrayList<Integer> subsetSum(int[] arr, int sum, int n)
	{
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
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[] arr_2 = t[n];
		for(int i = 0; i <=  sum / 2 ; i++)
		{
			if(arr_2[i])
				list.add(i);
		}
		
		return list;
		
	}
}
	