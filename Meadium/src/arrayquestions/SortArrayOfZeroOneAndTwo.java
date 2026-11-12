package arrayquestions;

public class SortArrayOfZeroOneAndTwo {

	public static void main(String[] args) {
		int[] array ={ 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		int zero=0;
		int one=0;
		int two=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				zero++;
			else if(array[i]==1)
				one++;
			else if (array[i]==2)
				two++;
		}
		
		int[] newarray = new int[array.length];
		
		for(int i=zero;i<newarray.length-two;i++)
		{
			newarray[i]=1;
		}

		
		  for(int i=zero+one;i<newarray.length;i++) 
		  { newarray[i]=2; }
		 
		
		for(int i=0;i<newarray.length;i++)
		{
			System.out.println("Sorted arrays is"+newarray[i]);
		}
		
	}

}
