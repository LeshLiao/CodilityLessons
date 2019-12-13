#include <iostream>
#include <vector>
using namespace std;
int solution(int N);
int main()
{
    cout << solution(1000) << endl;
    return 0;
}

int solution(int N) {

    vector<int> intVector{1,1};
    int adding = 0;

    for(int i = 1;i<N;i++)
    {
        vector<int> vecTemp(intVector);
        for (std::size_t j = 0; j != intVector.size()-1; j++)
        {
            int temp = vecTemp[j]+vecTemp[j+1]+adding;
            if(temp>9)
            {
                adding = 1;
            }
            else
            {
                adding = 0;
            }
            intVector[j+1] = temp%10;
        }
        intVector.push_back(1);
    }
    int countOne = 0;
    for (auto x : intVector)
    {
        if(x == 1) countOne++;
        cout << x;
    }

    cout << "" << endl;
    return countOne;
}
