#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cout<<"Enter the number of elements in the array";
    std::cin >> n;
    int arr[n];
    std::cout<<"\nEnter the elements in the array";
    for(int i = 0; i < n; i++)
    {
      std::cin >> arr[i]; 
      
      
    }
    int i;
    int odd = 0, even = 0;
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            odd++;
        if(arr[i] % 2 == 0)
            even++;
    }
    if(odd == n)
        std::cout <<"\nThe array is Odd";
    else if(even == n)
        std::cout <<"\nThe array is Even";
    else
        std::cout <<"\nThe array is Mixed";
}