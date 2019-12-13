package lesson1.iterations;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Sol = new Solution();
		System.out.println("Value="+Sol.solution(561892));
	}

}

class Solution 
{
    public int solution(int N) {
        // write your code in Java SE 8
    	String binString = Integer.toBinaryString(N);
    	int _maxGapLength = 0;
    	int _gapCount = 0;
    	
    	for(int i = 0;i< binString.length();i++)
    	{
    		char _Onechar = binString.charAt(i);
    		if(_Onechar == '0')
    			_gapCount++;
    		
    		if(_Onechar == '1')
    		{
    			if(_gapCount > _maxGapLength)
    			{
    				_maxGapLength =_gapCount; 
    			}
    			_gapCount = 0;
    		}
    	}
    	
    	return _maxGapLength;
    }
}
