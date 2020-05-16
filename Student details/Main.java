#include<iostream>
#include<string.h>
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};
int comparator(const void* p,const void* q)
{
  return strcmp(((struct Student*)p)->name,((struct Student*)q)->name);
}
int main()
{
  int n,i,k=1,l=1;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  struct Student arr[n];
  for(i=0;i<n;i++,l++)
  {
    cout<<"Enter the details of student "<<l<<endl;
    cout<<"Enter name"<<endl;
    cin>>arr[i].name;
    cout<<"Enter department"<<endl;
    cin>>arr[i].department;
    cout<<"Enter year of study"<<endl;
    cin>>arr[i].yearOfStudy;
    cout<<"Enter cgpa"<<endl;
    cin>>arr[i].cgpa;
}
  qsort(arr,n,sizeof(struct Student),comparator);
  cout<<"Details of students"<<endl;
  for(i=0;i<n;i++,k++)
  {
    cout<<"Student "<<k<<endl;
    cout<<"Name:"<<arr[i].name<<endl;
    cout<<"Department:"<<arr[i].department<<endl;
    cout<<"Year of study:"<<arr[i].yearOfStudy<<endl;
    cout<<"CGPA:"<<arr[i].cgpa<<endl;
  }
  return 0;
}
