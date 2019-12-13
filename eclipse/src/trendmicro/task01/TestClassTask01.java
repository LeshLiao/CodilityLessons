package trendmicro.task01;
public class TestClassTask01 {
    public static void main(String[] args) {
        //String S = "aabab";
        String S = "baaaa";
        Solution Sol = new Solution();
        System.out.println("Return:"+Sol.solution(S));
    }
}

class Solution
{
	public int solution(String S) 
    {
		int countA = 0;
		int consecutiveA = 0;
		boolean isConsecutiveThreeA = false;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i) == 'a')
			{
				consecutiveA++;
				if(consecutiveA >= 3)
				{
					isConsecutiveThreeA = true;
					break;
				}
			}
			else
			{
				countA = countA + (2-consecutiveA);
				consecutiveA = 0;
			}
		}
		countA = countA + (2-consecutiveA);
		if(isConsecutiveThreeA)
		{
			countA = -1;
		}
        return countA;
    }
}