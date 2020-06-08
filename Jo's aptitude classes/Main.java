#include<iostream>
int main()
{
int a,b,c,d,gcd=0;
std::cin>>a>>b>>c>>d;
int small=0;
if(a<=b&&a<=c)
{small=a;}
  else if(b<=c&&b<=a)
  {small=b;}
  else
  {small=c;}
  while(small>=1){
  if(a%small==0&&b%small==0&&c%small==0)
  {gcd=small;
  break;}
    small--;
  }
  if(small==d)
  {std::cout<<"Answer is correct.";}
  else
  {std::cout<<"Answer is wrong.";}
}