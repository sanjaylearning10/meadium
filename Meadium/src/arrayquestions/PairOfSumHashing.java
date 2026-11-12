package arrayquestions;

import java.util.HashMap;
import java.util.Map;

public class PairOfSumHashing {
	
	public static void main(String...args)
	{
		int[] array = {8, 7, 2, 5, 3, 1 };
		int data=10;
		
		Map<Integer,Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<array.length;i++)
		{
			if(hashMap.containsKey(data-array[i]))
			{
				System.out.println(array[i]+" "+array[hashMap.get(data-array[i])]);
			}
			else
			{
				hashMap.put(array[i], i);
			}
		}
		
	}

}
