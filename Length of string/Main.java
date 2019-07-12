#include<stdio.h>
#include<string.h>
int main()
{
  char s[1000];
    int i;
   // printf("Enter a string: ");
gets(s);
  for(i = 0; s[i] != NULL; ++i);
    printf("%d", i);
  //Type your code here
  return 0;
}