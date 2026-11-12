package arrayquestions;

public class SortBinaryArrayInLinear {

	public static void main(String[] args) {
		int[] array =	{ 1, 0, 1, 0, 1, 0, 0, 1 };
		
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
				count++;
			}
		}
		
		System.out.println("number of zero in array is "+count);	
		
		int[] sortedArray=new int [array.length];
		
		for(int i=count;i<sortedArray.length;i++)
		{
			sortedArray[i]=1;
		}
		
		System.out.println("Newly sorted array is");
		
		for(int i=0;i<sortedArray.length;i++)
		{
		System.out.print(sortedArray[i]+" ");	
		}
		
		

	}

}
