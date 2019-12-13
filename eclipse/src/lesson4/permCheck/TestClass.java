package lesson4.permCheck;
public class TestClass {
    public static void main(String[] args) {
        int testInput[] = {4,1,3,2};
        //int testInput[] = {4,1,3};
        //int testInput[] = {1};
        Solution Sol = new Solution();
        System.out.println(Sol.solution(testInput));
    }
}

class Solution
{
    public int solution(int[] A) 
    {
        int len = A.length;
        int[] elementFlag = new int[len];
        
        for(int i=0;i<A.length;i++)
        {
            int index = A[i]-1;
            if(index < A.length && index >= 0)
            {
                elementFlag[index] = 1;
            }
            else
            {
                break;
            }
        }
        return checkArray(elementFlag);
    }

    private int checkArray(int[] elementFlag)
    {
        int result = 1;
        for(int i=0;i<elementFlag.length;i++)
        {
            if(elementFlag[i] == 0)
            {
                result = 0;
                break;
            }
        }
        return result;
    }
}