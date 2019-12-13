package lesson3.permMissingElem;
public class TestClass {

	public static void main(String[] args) {
		int testInput[] = {2,3,1,5,8,7,6};
		Solution Sol = new Solution();
    	System.out.println(Sol.solution(testInput));
	}
}

class Solution
{
	public int solution(int[] A) 
	{
		long lenArray = A.length;
        long sum = ((lenArray+2)*(lenArray+1))/2;
        for(int i=0;i<A.length;i++)
        {
            sum = sum - A[i];
        }
        return (int)sum;
	}
}