#include <iostream>
using namespace std;

int main()
{
    int a,b,c;
    int r;
    std::cin>>a>>b>>c;
    r=c%3;
    if (r!=0)
    {
      std::cout<<"It is a mango tree";
    }
    else
    {
    std::cout<<"It is not a mango tree";
    }
}