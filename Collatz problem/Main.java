#include <iostream>
using namespace std;
unsigned long long collatzConjecture(unsigned long long num);
int main(){
  unsigned long long number;
  unsigned long long iterNum = 0;
  
  
  cin >> number;
  
  cout<<number<<"\n";
  
  while(number != 1){
    number=collatzConjecture(number);
    cout<<number<<"\n";
    iterNum++;
  }
  cout<<iterNum << endl;
  return 0;
}
unsigned long long collatzConjecture(unsigned long long num){
  if(num % 2 == 0){
    return num / 2;
  }else{
    return 3 * num + 1;
  }
}