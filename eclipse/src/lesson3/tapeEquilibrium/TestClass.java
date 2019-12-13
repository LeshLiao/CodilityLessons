package lesson3.tapeEquilibrium;
public class TestClass {

	public static void main(String[] args) {
		int testInput[] = {3,1,2,4,3};
		Solution Sol = new Solution();
    	System.out.println(Sol.solution(testInput));
	}
}

class Solution
{
    public int solution(int[] A) 
    {
        int leftSum = 0;
        int rightSum = getRightSum(A);
        int minum = Math.abs(rightSum-A[0]-A[0]);
        for(int p=1;p<A.length;p++)
        {
            leftSum = leftSum + A[p-1];
            rightSum = rightSum - A[p-1];
            if(Math.abs(rightSum-leftSum) < minum)
            {
                minum = Math.abs(rightSum-leftSum);
            }
        }
        return minum;
    }

    private int getRightSum(int[] A)
    {
        int rightSum = 0;
        for(int i=0;i<A.length;i++)
        {
            rightSum += A[i];
        }
        return rightSum;
    }
}