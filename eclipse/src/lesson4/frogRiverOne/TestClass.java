package lesson4.frogRiverOne;
public class TestClass {
    public static void main(String[] args) {
        int testInput[] = {1,3,1,4,2,3,5,4};
        //int testInput[] = {4,1,3};
        //int testInput[] = {1};
        Solution Sol = new Solution();
        System.out.println(Sol.solution(5,testInput));
    }
}
 
class Solution
{
    public int solution(int X, int[] A)
    {
        int[] elementFlag = new int[X];
        int countPosition = 0;
        int earliestTime = -1;
        
        for(int i=0;i<A.length;i++)
        {
            int index = A[i]-1;
            if(index < X && index >= 0)
            {
                if(elementFlag[index] == 0)
                {
                    elementFlag[index] = 1;
                    countPosition++;
                }
            }
            if(countPosition == X)
            {
                earliestTime = i;
                break;
            }
        }
        return earliestTime;
    }
}