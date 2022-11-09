package arrays;

public class Array1 {

	public static void main(String[] args)
	{
		int[] arr = new int[4];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 2; 
		System.out.println(arr.length);
		System.out.println(arr[0]+arr[1]);
		
		// multi-dimensional array
		
		int a[][] = new int[2][3];
		a[0][0] = 1;
		
		int b[][] = {{1,2,3},{1,2,3}};
		
		System.out.println(b.length);
		
		for(int i =0; i<b.length; i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		// for each
		for(int item : arr)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		// for each
				for(int[] item : b)
				{
					for(int i : item)
					{
						System.out.print(i+" ");
					}
					System.out.println();
				}
		
	}
}
