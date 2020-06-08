#include<iostream>
using namespace std;
struct college
{
char name[30];
char city[30];
int year;
float percent;};
int main()
{
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  college c[n];
  for(int i=0;i<n;i++)
  {cout<<"Enter the details of college "<<i+1<<"\n";
   cout<<"Enter name\n"; 
   cin>>c[i].name;
   cout<<"Enter city\n";
   cin>>c[i].city;
   cout<<"Enter year of establishment\n";
   cin>>c[i].year;
   cout<<"Enter pass percentage\n";
   cin>>c[i].percent;
   }
  cout<<"Details of colleges\n";
  for(int i=0;i<n;i++)
  {cout<<"College:"<<i+1<<"\n";
   cout<<"Name:"<<c[i].name<<"\n";
    cout<<"City:"<<c[i].city<<"\n";
    cout<<"Year of establishment:"<<c[i].year<<"\n";
   cout<<"Pass percentage:"<<c[i].percent<<"\n";
  }
}