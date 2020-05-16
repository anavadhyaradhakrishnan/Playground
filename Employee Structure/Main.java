#include <iostream>
using namespace std;

struct Person
{
    char name[500];
    string designation;
    int age,id;
    float salary;
};

int main()
{
    struct Person p1;
    cout << "Enter name: ";
    cin.get(p1.name,500);
    cout << "\n"<<"Enter ID: ";
    cin >> p1.id;
    cout << "\n"<<"Enter age: ";
    cin >> p1.age;
    cout << "\n"<<"Enter designation: ";
    cin >> p1.designation;
    cout << "\n"<<"Enter Salary: ";
    cin >> p1.salary;

    cout << "\nEmployee Details" << endl;
    cout <<"Name of the Employee : " << p1.name << endl;
    cout <<"ID of the Employee : " << p1.id << endl;
    cout <<"Age of the Employee : " << p1.age << endl;
    cout <<"Designation of the Employee : " << p1.designation << endl;
    cout <<"Salary of the Employee : " << p1.salary;

    return 0;
}