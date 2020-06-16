class Xyz
{
	public static void main(String[] args)
	{
		String X = "abcdgh";
		String Y = "abedfghr";
		
		int n = X.length();		
		int m = Y.length();
		
		
		System.out.println(LCS(X,Y,n,m));
		
		
	}
	
	static int  LCS(String x, String y, int n, int m)
	{
		//base condition
		//if either strings are empty, return 0, as LCS possible
		//with either of them 0 is 0 only
		if(n == 0 || m == 0)
			return 0;
		
		//if both ending chars are same, add 1 to LCS length 
		//and call recursivley by excluding both chars
		if(x.charAt(n - 1) == y.charAt(m - 1))
			return 1 + LCS(x,y,n - 1, m - 1);
		
		else
			return Math.max(LCS(x,y,n, m - 1), LCS(x,y,n -1, m));
		
	}
}
	