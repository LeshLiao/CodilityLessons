package trendmicro.task02;
public class TestClassTask02 {
    public static void main(String[] args) {
        int testInput[] = {4,2,2,4,2};
        //int testInput[] = {1,2,3,2};
    	//int testInput[] = {0,5,4,4,5,12};
    	//int testInput[] = {4,4};
        Solution Sol = new Solution();
        System.out.println(Sol.solution(testInput));
    }
}

class Solution
{
    public int solution(int[] A)
    {
        int longestBiValue = 0;
        int leftOfNum = 1000000001;
        int rightOfNum = 1000000001;
        int countBiValue = 0;
        
        for(int i=0;i<A.length;i++)
        {
            if(leftOfNum != A[i] && rightOfNum != A[i])
            {	
                leftOfNum = rightOfNum;
                rightOfNum = A[i];
                if(leftOfNum == 1000000001) 
                    countBiValue = 1;
                else
                    countBiValue = 2;
            }
            else
            {
                countBiValue++;
                if(countBiValue > longestBiValue) longestBiValue = countBiValue;
            }
        }
        return longestBiValue;
    }
}