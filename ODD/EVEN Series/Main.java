#include<stdio.h>
int main()
{
  int n,s1,s2,a,d,n_term;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    s1=(n+1)/2;
    n_term=a+(s1-1)*d;
    printf("%d",n_term);
  }
  else
  {
    a=0,d=1;
    s2=n/2;
    n_term=a+(s2-1)*d;
    printf("%d",n_term);
  }
	//type your code here
	
}