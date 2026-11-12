package arrayquestions;

import java.util.Arrays;

public class PairOfSumSorting {

	public static void main(String[] args) {
	
		//int[] array = {8, 7, 2, 5, 3, 1};
		//int data=10;
	
		int[] array = {5, 2, 6, 8, 1, 9};
		int data=12;
	
		Arrays.sort(array);
	
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
		
		System.out.println("***************************");
		
		int low=0; 
		int high=array.length-1;
		
		while(low<high)
		{
			if(array[low]+array[high]==data)
			{
				System.out.println("Pair of Array is "+array[low]+" "+array[high]);
				return;
			}
			if(array[low]+array[high]<data)
			{
			low++;
			}
			else
			{
			high--;
			}
		}
		
		System.out.println("Pair not found");
	}

}
