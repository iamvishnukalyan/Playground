#include <bits/stdc++.h> 
using namespace std; 
float distance(int x1, int y1, int x2, int y2) ;
  int main()
{ 
 int x1=3,x2,y1=4,y2,d;
 std::cin>>x2>>y2;
    d=sqrt(pow(x2 - x1, 2) +  
                pow(y2 - y1, 2));
    std::cout<<d;
} 
  