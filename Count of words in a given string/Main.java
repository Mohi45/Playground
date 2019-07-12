#include<stdio.h>
#include<string.h>
int main()
{
   char str[50];
              int i,count=0;

              gets(str);
              
              for(i=0;str[i];i++)
                     if(str[i] == ' ')
                           count++;
              
              printf("%d",count+1);
   return 0;
}