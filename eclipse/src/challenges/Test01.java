package challenges;
import java.lang.Math; 


public class Test01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[][] = {{9,9,7},{9,7,2},{6,9,5},{9,1,2}};
		Solution a = new Solution();
		System.out.println(a.solution(test));
	}

}

class Solution {
	
    public String solution(int[][] A) {
        // write your code in Java SE 8
        int N = A.length;
        int M = A[0].length;
        int total = (M-1)+(N-1);
        int max = (int)Math.pow(2,total);
        
        int bbb = (M-1)+(N-1);
        int maxValue = 0;
        String maxStr = "";
        
        for(int i = 0;i < max;i++)
        {

        	String binString = Integer.toBinaryString(i);
			while (binString.length() < bbb) {    //pad with 16 0's
				binString = "0" + binString;
			}
			
        	int ZeroCount = binString.length() - binString.replace("0", "").length();
        	int OneCount = binString.length() - binString.replace("1", "").length();
        	if (ZeroCount > N-1 || OneCount > M-1)
        		continue;
        	
        	if(GetValueByString(binString,A) > maxValue)
        		maxValue = GetValueByString(binString,A);
        		maxStr = binString;
         }
        return Integer.toString(maxValue);

    }
     
    public int GetValueByString(String str,int[][] A)
    {
    	int x = 0;
    	int y = 0;
    	String tempstr = Integer.toString(A[x][y]); 
    	
    	for(int i = 0;i< str.length();i++)
    	{
    		char charAtZero = str.charAt(i);
    		if(charAtZero == '0')
    			x++;
    		else
    			y++;
    	
    		tempstr += Integer.toString(A[x][y]);
    	}
    	return Integer.parseInt(tempstr);
    }	
	
    
}