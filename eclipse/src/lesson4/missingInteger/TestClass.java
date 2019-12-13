package lesson4.missingInteger;
public class TestClass {
    public static void main(String[] args) {
        int testInput[] = {1,3,6,4,1,2};
        //int testInput[] = {1,2,3};
        //int testInput[] = {-1,-3,-4,9};
        Solution Sol = new Solution();
        System.out.println(Sol.solution(testInput));
    }
}

class Solution
{
    public int solution(int[] A) 
    {
        int maxinum = findMaxinum(A);
        boolean[] elementFlag;
        if(maxinum == 0)
        {	
            return 1;
        }
        else
        {
            elementFlag = new boolean[maxinum];
            for(int i=0;i<A.length;i++)
            {
                int index = A[i]-1;
                if(index < elementFlag.length && index >= 0)
                {
                    elementFlag[index] = true;
                }
            }
        }

        return findSmallestInt(elementFlag);
    }

    private int findMaxinum(int[] A)
    {
        int resultMax = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] > resultMax)
            {
                resultMax = A[i];
            }
        }
        return resultMax;
    }

    private int findSmallestInt(boolean[] elementFlag)
    {
        int i;
        for(i=0;i<elementFlag.length;i++)
        {
            if(elementFlag[i] == false)
            {
                break;
            }
        }
        return i+1;
    }
}