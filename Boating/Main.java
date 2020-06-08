#include<iostream>
using namespace std;
int main()
{
  int a,b,c,h;
  cin>>a>>b>>c;
  h=(b*75)+(c*30);
   
  if (h<=a) {
  cout << "Boat is stable";}
  
  else {
  cout << "Boat will drow";}
}
