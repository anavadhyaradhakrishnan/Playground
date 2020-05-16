#include<iostream>
using namespace std;
int main()
{
 
  int i, j, rows, columns, a[10][10], Sum;
        std::cin>>i>>j;
        for(rows = 0; rows < i; rows++)
    {
        for(columns = 0; columns < j; columns++)
        {
            std::cin>>a[rows][columns];
        }
    }
    
    for(rows = 0; rows < i; rows++)
    {
        Sum = 0;
        for(columns = 0; columns < j; columns++)
        {
            Sum = Sum + a[rows][columns];
        }
       std::cout<<Sum<<"\n";
    }
    
    return 0;
}
