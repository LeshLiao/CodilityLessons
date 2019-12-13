package lesson4.maxCounters;
public class TestClass {
    public static void main(String[] args) {
        int testInput[] = {3,4,4,6,1,4,4};
        //int testInput[] = {4,1,3};
        //int testInput[] = {1};
        Solution Sol = new Solution();
        
        int[] result = Sol.solution(5,testInput);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+",");
        }
    }
}

class Solution
{
    public int[] solution(int N, int[] A)
    {
        int[] counters = new int[N];
        int maxValue = 0;
        int baseValue = 0;	
        for(int i=0;i<A.length;i++)
        {
            int index = A[i]-1;
            if(index < N && index >= 0)
            {
                if(counters[index] < baseValue)
                {
                    counters[index] = baseValue + 1;
                }
                else
                {
                    counters[index]++;
                }
                if(counters[index] > maxValue)
                {
                    maxValue = counters[index];
                }
            }
            else if(index == N)
            {
                baseValue = maxValue;
                //setAllToTheMaximum(counters,maxValue);
            }
        }
        
        //Better solution
        //Detected time complexity: O(N + M)   
        for(int i=0;i<counters.length;i++) 
        {
            if(counters[i] < baseValue)
            {
                counters[i] = baseValue;
            }
        }
        
        return counters;
    }

    //Not an efficient solution
    private void setAllToTheMaximum(int[] counters,int maxValue)
    {
        for(int i=0;i<counters.length;i++)
        {
            counters[i] = maxValue;
        }
    }
}