package arrayquestions;

import java.util.Arrays;

public class MaxProductTwoIntegerUsingSorting {

	public static void main(String[] args) {
		int[] array = {-10, -3, 5, 6, -2};
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(""+array[i]);
		}
		
		System.out.println("Max Product of two numbers are "+ array[array.length-1]*array[array.length-2]);


	}

}
