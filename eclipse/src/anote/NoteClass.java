package anote;
public class NoteClass {
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
    	// To declare a variable
        int len = A.length;
        int[] elementFlag = new int[len];
        int test[][] = {{9,9,7},{9,7,2},{6,9,5},{9,1,2}};

        // Math
        int max = (int)Math.pow(2,3);		//2^3=8
        System.out.println("max="+max);

        // print A array
        printArray(A);
        
        return 0;
    }

	private boolean printArray(int[] A)
	{
		System.out.print("Array=");
    	for(int i = 0;i < A.length ; i++)
    	{
    		System.out.print(A[i]+",");
    	}
    	System.out.println();
		return true;
	}
}