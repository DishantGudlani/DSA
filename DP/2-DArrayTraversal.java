class Xyz
{
	public static void main(String[] args)
	{
		int[][] k = new int[3][4];
		
		for(int i = 0; i < k.length; i++)
		{
			for(int j = 0; j < k[i].length; j++)
			{
				k[i][j] = 3;
				System.out.print(" " + k[i][j]);
			}
			System.out.println("");
		}
		
		
	}
}
	