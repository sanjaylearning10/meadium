package arrayquestions;

public class MaxProductTwoInteger {

	public static void main(String[] args) {
		int[] array = {-10, -3, 5, 6, -2};
		int product=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]*array[j]>=product)
				{
					product=array[i]*array[j];
					System.out.println("Two integers are "+ i+"  "+j);
					
				}
			}
		}
		
		System.out.println("Product is "+ product);


	}

}
