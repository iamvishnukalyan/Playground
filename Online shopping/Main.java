#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3,f,s,a,F,S,A;
  std::cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  f = (f1*f2)/100;
  F = f1 - f + f3;
  s = (s1*s2)/100;
  S = s1 - s + s3;
  a = (a1*a2)/100;
  A = a1 - a + a3;
  std::cout<<"In Flipkart Rs."<<F<<"\n";
  std::cout<<"In Snapdeal Rs."<<S<<"\n";
  std::cout<<"In Amazon Rs."<<A<<"\n";
  if(F<=S && F<=A){
  std::cout<<"He will prefer Flipkart";
  }
  else if(S<=A && S<=A){
  std::cout<<"He will prefer Snapdeal";
  }
  else
    std::cout<<"He will prefer Amazon";
}