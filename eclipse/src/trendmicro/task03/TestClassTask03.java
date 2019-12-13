package trendmicro.task03;
public class TestClassTask03 {
    public static void main(String[] args) {
        Solution Sol = new Solution();
        //System.out.println(Sol.solution(6,1,1));
        //System.out.println(Sol.solution(1,3,1));
        System.out.println(Sol.solution(0,1,8));
    }
}

class Solution
{
	public String solution(int A, int B, int C)
    {
		String returnStr = "";
		int aNum = A;
		int bNum = B;
		int cNum = C;
		
		getMaxNumofStr(aNum,bNum,cNum);

        return returnStr;
    }
	
	private String getMaxNumofStr(int aNum,int bNum,int cNum)
	{
		if(aNum >= bNum && aNum >= cNum) return "a";
		if(bNum >= aNum && bNum >= cNum) return "b";
		if(cNum >= aNum && cNum >= bNum) return "c";
		return "";
	}
}