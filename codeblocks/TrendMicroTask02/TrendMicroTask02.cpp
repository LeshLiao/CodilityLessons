#include <iostream>

using namespace std;
string solution(string &S, string &T);

int main()
{
    //string S = "gain";
    //string T = "again";

    string S = "parks";
    string T = "parkbbb";
    cout << solution(S,T) << endl;
    return 0;
}
string solution(string &S, string &T) {
    // write your code in C++14 (g++ 6.2.0)
    static const size_t npos = -1;
    if(T.length()>S.length())
    {
        std::size_t found = T.find(S);
        cout << "case A found=" << found << endl;
        if(found > 0)
        {
            return "INSERT "+T.substr(0,found);
        }
        else
        {
            return "INSERT "+T.substr(T.length(),1);
        }
    }

    if(S.length()>T.length())
    {
        std::size_t found = S.find(T);
        cout << "case B found=" << found << endl;
        if(found == 0)
        {
            return "REMOVE "+S.substr(S.length(),1);
        }
        else
        {
            return "REMOVE "+S.substr(0,found);
        }
    }

    if(T.length()==S.length())
    {

    }

    return S+T;
}
