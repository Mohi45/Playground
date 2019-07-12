#include<stdio.h>
int main()
{
  int n,i,a,b,i1=-1,i2=-1;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d%d",&a,&b);
for(i=0;i<n;i++)
{
  if(a==arr[i]&& i1==-1)
  {
   i1=i;
  }
  if(b==arr[i]&& i2==-1)
  {
   i2=i;
  }
  
}
  printf("Element 1 index = %d \nElement 2 index = %d",i1,i2);
  	//type your code here
  	//type your code here
}