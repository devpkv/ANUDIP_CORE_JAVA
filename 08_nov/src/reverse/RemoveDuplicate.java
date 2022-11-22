package reverse;

import java.util.Scanner;

public class RemoveDuplicate {
	
	 
	
	private static void removeDuplicate(int[] arr, int len)
	{
		boolean flag = false;
		for(int i = 0; i < len; i++)
		{
			int num = arr[i];
			for(int j = i+1; j < len; j++)
			{
				if(num == arr[i])
				{
					flag = true;
					break;
				}
			}
			
			if(!flag)
			{
				System.out.println(num);
				flag = false;
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter length");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		System.out.println("Enter numbers : ");
		for(int i =0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		removeDuplicate(arr,len);
		
		sc.close();
		
	}

}
