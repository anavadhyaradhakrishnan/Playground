#include<iostream>
using namespace std;
int main()
{
 
  int r, c, a[100][100], b[100][100], sum[100][100], i, j;
    std::cin >> r;
  std::cin >> c;
    for(i = 0; i < r; ++i)
       for(j = 0; j < c; ++j)
       {
          
           cin >> a[i][j];
       }
    for(i = 0; i < r; ++i)
       for(j = 0; j < c; ++j)
       {
        
           std::cin >> b[i][j];
       }
   for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
            sum[i][j] = a[i][j] + b[i][j];
     for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
        {
            std::cout << sum[i][j] << " ";
            if(j == c - 1)
                std::cout<<"\n";
        }
    return 0;
}
