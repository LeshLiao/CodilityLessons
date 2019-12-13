#include <iostream>
#include <vector>

using namespace std;
int solution(vector<int> &A);
int main()
{
    //vector<int> testInput{2,1,3,5,4};
    //vector<int> testInput{2,3,4,1,5};
    vector<int> testInput{1,3,4,2,5};
//    for(int n : testInput) {
//        cout << n << '\n';
//    }

    cout << "Return:" << solution(testInput) << endl;
    return 0;
}

int solution(vector<int> &A) {
    int result = 0;
    int numBulb = A.size();
    vector<bool> plugFlag(numBulb);

    for (std::size_t i = 0; i < A.size(); i++)
    {
        int index = A[i]-1;
        if(index >=0 && index < numBulb)
        {
            plugFlag[index] = true;
        }
        std::size_t statusOn = 0;
        for (std::size_t j = 0; j < i+1; j++)
        {
            if(plugFlag[j] == true)
            {
                statusOn++;
            }
        }
        if(statusOn == i+1)
        {
            result++;
        }
    }
    return result;
}
