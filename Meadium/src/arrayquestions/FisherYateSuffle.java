package arrayquestions;

import java.util.Arrays;
import java.util.Random;

public class FisherYateSuffle {
	
	public static void swap(int[] a, int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
   
 
    public static void main (String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
 
        shuffle(A);
        System.out.println(Arrays.toString(A));
        
    }

	private static void shuffle(int[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			Random random= new Random();
			int j=random.nextInt(i+1);
			swap(a,i,j);
		}
	}

}
