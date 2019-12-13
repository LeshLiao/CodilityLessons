package lesson3.frogJmp;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Solution Sol = new Solution();

    	System.out.println(Sol.solution(20, 101,10));
	}
}

class Solution
{
	public int solution(int X,int Y,int D) 
	{
		int countStep = 0;
		if(X > Y || D <= 0)
		{
			countStep = 0;
		}
		else
		{
			//solution 01
//			int sum = 0;
//			int distance = Y - X;
//			while(sum < distance)
//			{
//				sum += D;
//				countStep++;
//			}
		
			//solution 02
			int addition = 1;
			if((Y-X)%D == 0) addition = 0;
			return ((Y-X)/D)+addition;
		}
		return countStep;
	}
	

	
}