#include<iostream>
using namespace std;
int main()
{
  int i1,j1,i2,j2,d,c,e;
  cin>>i1>>j1>>i2>>j2;
  d=i1+i2;
  c=j1+j2;
  if(c>=100)
  {
     e=c/100;
     d=d+(e);
 	 c=c-(e*100);
  }
  cout<<d<<"\n"<<c;
  return 0;
}