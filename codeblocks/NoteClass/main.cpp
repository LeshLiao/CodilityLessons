#include <iostream>

using namespace std;
int solution(string S);

int main()
{
    cout << "Hello world!" << endl;

    string str = "test";
    solution(str);
    solution(str);

    return 0;
}

int solution(string S)
{
    cout <<  S.length() << endl;

    for(std::size_t i = 0;i<S.length();i++)
        cout <<  S.at(i) << endl;

    return 0;
}

