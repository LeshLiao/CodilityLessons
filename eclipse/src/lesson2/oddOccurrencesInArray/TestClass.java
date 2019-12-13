package lesson2.oddOccurrencesInArray;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		//int test[] = {7,9,3,9,3,9,9};
		int test[] = {9,3,3,9,7};
		Solution a = new Solution();
		System.out.println(a.solution(test));

	}

}
class Solution 
{
    public int solution(int[] A) 
    {
        int[] scores2 = Arrays.copyOf(A, A.length);
    	int unpaired = 0;
    	for(int i = 0;i < scores2.length ; i++)
    	{
     		int _value = scores2[i];
    		int j;
    		for(j = 0;j < scores2.length;j++)
    		{
    			if(_value == scores2[j]&& i!=j)
    				break;
    		}
     		if(j == scores2.length)
    		{
    			unpaired = _value;
    			break;
    		}
    	}
    	return unpaired;
    }
}
