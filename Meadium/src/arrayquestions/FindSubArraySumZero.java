package arrayquestions;

public class FindSubArraySumZero {

	public static void main(String[] args) {
	
		int[] array ={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		
		
		for(int i=0;i<array.length;i++)
		{
			int sum=array[i];
			
			for(int j=i+1;j<array.length;j++)
			{
			sum=sum+array[j];
				if(sum==0)
				{
					System.out.println(i+" "+j);
				}
			
		}
		}
	}

}
