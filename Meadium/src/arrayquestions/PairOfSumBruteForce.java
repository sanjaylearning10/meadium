package arrayquestions;

public class PairOfSumBruteForce {

	public static void main(String[] args) {
		
		//int[] array = {8, 7, 2, 5, 3, 1};
		//int data=10;
		
		int[] array = {5, 2, 6, 8, 1, 9};
		int data=12;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==data)
				{
					System.out.println("pair of data is "+array[i]+" "+array[j]);
				}
			}
		}
		System.out.println("Pair is not found");
	}

}
