package arrayquestions;

public class InplaceMergeTwoSortedArray {

	public static void main(String[] args) {
		int X[] = { 1, 4, 7, 8, 10 };
		int Y[] = { 2, 3, 9 };
		
		int[] arr= new int[X.length];
		int[] arr1= new int[Y.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		
		while(i<X.length && j<Y.length)
		{
			if(X[i]<Y[i])
			{
				arr[k]=X[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=Y[j];
				j++;
				k++;
			}
		}
		while(i<X.length)
		{
			arr1[k]=X[i];
			i++;
			k++;
		}
		while(j<Y.length)
		{
			arr1[k]=X[j];
			j++;
			k++;
		}

		for(int a=0;a<arr.length;a++)
		{
			System.out.println(arr[a]+" ");
		}
		
		for(int a=0;a<arr.length;a++)
		{
			System.out.println(arr1[a]+" ");
		}
	}

}
