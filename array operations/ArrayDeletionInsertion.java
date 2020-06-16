class Xyz
{
	static int[] arr = new int[100];
	
	public static void main(String[] args)
	{
		int length = 6;
		System.out.println("array before deletion");
		//array before
		for(int i = 0; i < 6; i++)
		{
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		
		
		System.out.println("array after deletion");
		//insert(100, length, length);
		int pos = length - 1;
		delete(pos, length);
		
		
		
	}
	
	static void insert(int element, int pos, int length)
	{
		//shifting all elements one step left to right from pos to length - 1
		for(int i = length - 1; i >= pos; i--)
		{
			arr[i + 1] = arr[i];
		}
		
		arr[pos] = element;
		
		for(int i = 0; i < length + 1; i++)
		{
			
			System.out.println(arr[i]);
		}
	}
	
	static void delete(int pos, int length)
	{
		
		for(int i = pos; i < length - 1; i++)
		{
			arr[i] = arr[i + 1];
		}
		
		for(int i = 0; i < length - 1; i++)
		{
			System.out.println(arr[i]);
		}
	}
}