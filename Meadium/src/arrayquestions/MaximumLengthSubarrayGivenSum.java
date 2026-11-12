package arrayquestions;

public class MaximumLengthSubarrayGivenSum {

	public static void main(String[] args) {
		
		int[] array = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int data = 8;
		int max=0;
		int endingindex=-1;
		int sum;
		
		for(int i=0;i<array.length;i++)
		{
			sum=array[i];
			
			for(int j=i+1;j<array.length;j++)
			{
				sum=sum+array[j];
				
				if(sum==data)
				{
					System.out.println("Array indexs are "+ i +" " + j+" and array data is "+array[i]+" "+array[j]);
					
					if(max<j-i+1)
					{
						max=j-i+1;
						endingindex=j;
						System.out.println("maximum length of sub array is "+max);
					}
				}
				
			}
		}
	
		System.out.println("SubArray is "+(endingindex-max+1) +" "+endingindex);
		
		
	}

}
