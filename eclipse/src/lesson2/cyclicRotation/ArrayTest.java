package lesson2.cyclicRotation;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		Solution Sol = new Solution();
		int testInput[] = {1,2,3,4,5,6,7};
		//int testInput[] = {0,0,0};
		//int testInput[] = {};

    	for(int i = 0;i < testInput.length ; i++)
    	{
    		System.out.print(testInput[i]+",");
    	}
    	System.out.println();

		Sol.solution(testInput,3);
	
    	for(int i = 0;i < testInput.length ; i++)
    	{
    		System.out.print(testInput[i]+",");
    	}
    	System.out.println();
	}

}

class Solution
{
	public int[] solution(int[] A, int K) 
	{
        if(A.length == 0) return A;
        if(K > A.length) K = K % A.length;

        int[] A2 = Arrays.copyOf(A, A.length);
        int j = 0;
        for(int i = K;i < A.length ; i++)
        {
            A[i] = A2[j];
            j++;
        }
        
        int tempIndex = A.length - K;
        for(int i = 0;i < K ; i++)
        {
            A[i] = A2[tempIndex+i];
        }
        return A;
    }
	
	private boolean printArray(int[] A)
	{
    	for(int i = 0;i < A.length ; i++)
    	{
    		System.out.print(A[i]+",");
    	}
    	System.out.println();
		return true;
	}
	
}