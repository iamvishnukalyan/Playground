#include<iostream>
using namespace std;
struct employ
{
  char name[30];
int id;
int age;
char designation[30];
int salary;
};
 int main()
 {
   employ e;
 cout<<"Enter name:\n";
 cin>>e.name;
 cout<<"Enter ID:\n";
 cin>>e.id;
 cout<<"Enter age:\n";
 cin>>e.age;
 cout<<"Enter designation:\n";
 cin>>e.designation;
 cout<<"Enter Salary:\n";
 cin>>e.salary;
 cout<<"Employee Details\n";
 cout<<"Name of the Employee : "<<e.name<<"\n";
 cout<<"ID of the Employee : "<<e.id<<"\n";
 cout<<"Age of the Employee : "<<e.age<<"\n";
 cout<<"Designation of the Employee : "<<e.designation<<"\n";
 cout<<"Salary of the Employee : "<<e.salary;
 }