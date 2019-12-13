package lesson2.oddOccurrencesInArray;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int test[] = {9,3,9,3,9,7,9};
		Solution02 a = new Solution02();
		System.out.println(a.solution(test));
		
		int aa = 9;
		int bb = 3;
		
		
		//System.out.println((aa^bb));
	}

}
class Solution02
{
    public int solution(int[] A) 
    {
    	int result = 0;
    	for(int i = 0;i < A.length ; i++)
    	{
    		result ^= A[i];
    	}
    	return result;
    }
}