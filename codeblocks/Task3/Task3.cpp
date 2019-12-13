#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;
class NODE{
    public:
        NODE(string _letter,int _countNum)
        {
            letter = _letter;
            countNum = _countNum;
        }
        string letter;
        int  countNum;
};
string solution(int A,int B,int C);

int main()
{
    cout << "Hello world!" << endl;
    cout << solution(6,1,1) << endl;
    cout << solution(1,3,1) << endl;
    cout << solution(0,1,8) << endl;
    return 0;
}
bool compareInterval(NODE i1, NODE i2)
{
    return (i1.countNum > i2.countNum);
}
string solution(int A,int B,int C)
{
    int maxNum = A+B+C;
    string result = "";
    vector<NODE> letterList;
    NODE letter01("a",A);
    NODE letter02("b",B);
    NODE letter03("c",C);
    letterList.push_back(letter01);
    letterList.push_back(letter02);
    letterList.push_back(letter03);

    for (auto x : letterList)
        cout << x.letter << "," <<x.countNum << endl;

    string lastTwoChar = "";

    for(int i=0;i<maxNum;i++)
    {
        std::sort(letterList.begin(), letterList.end(), compareInterval);
        for (std::size_t i = 0; i != letterList.size(); ++i)
        {
            string str = letterList[i].letter+letterList[i].letter;
            if(lastTwoChar.compare(str)==0) continue;
            if(letterList[i].countNum <=0) continue;

            result = result + letterList[i].letter;
            if(result.length() == 2)
                lastTwoChar = result;
            if(result.length() > 2)
                lastTwoChar = lastTwoChar.substr(1,1)+letterList[i].letter;

            letterList[i].countNum--;
            break;
        }
    }
    return result;
}


