#include <iostream>
#include <vector>
using namespace std;

int solution(vector<int> &A);
int findMaxinum(vector<int> &A);
int findSmallest(vector<bool> &elementFlag);
int main()
{
    vector<int> testInput{1,3,6,4,1,2};
    //vector<int> testInput{1,2,3};
    //vector<int> testInput{-1,-2};

//    string str = to_string(3.1415926);
//    for(int i=0;i<testInput.size();i++)
//    {
//        cout << testInput[i] << ",";
//    }
    cout << "Return:" << solution(testInput) << endl;
    return 0;
}


int solution(vector<int> &A)
{
    int resultVal = 1;
    int maxValue = findMaxinum(A);
    if(maxValue == 0)
    {
        resultVal = 1;
    }
    else
    {
        vector<bool> elementFlag(maxValue);
        //cout << "maxValue:" << maxValue << endl;
        for (vector<int>::size_type i = 0; i < A.size(); ++i)
        {
            int index = A[i]-1;
            if(index >= 0 && index < maxValue)
            {
                elementFlag[index] = true;
            }
        }
        resultVal = findSmallest(elementFlag);
    }
    return resultVal;
}

int findMaxinum(vector<int> &A)
{
    int maxValue = 0;
    for (vector<int>::size_type i = 0; i < A.size(); ++i)
    {
        if(A[i] > maxValue) maxValue = A[i];
    }
    return maxValue;
}

int findSmallest(vector<bool> &elementFlag)
{
    int smallestInt = 1;
    vector<bool>::size_type i;
    for (i = 0; i < elementFlag.size(); ++i)
    {
        if(elementFlag[i] == false)
        {
            smallestInt = i+1;
            break;
        }
    }
    if(i == elementFlag.size())
    {
        smallestInt = i+1;
    }
    return smallestInt;
}
