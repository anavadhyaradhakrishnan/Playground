#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50];char str2[50];
  int i=0;
  gets(str1);
  gets(str2);
  i=strcmp(str1,str2);
  if(i==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}
