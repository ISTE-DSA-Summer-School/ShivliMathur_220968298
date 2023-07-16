# include<stdio.h>
int  main( )
{
int  num, rev=0 ;
int *pn,*pr ;
printf(" Enter the number : ") ;
scanf("%d ",&num) ;
pn = & num ;
pr = & rev ;
while(  *pn > 0)
{
*pr = (( *pr )* (*pn));
*pn = ( *pn ) -1 ;
}
printf("\n Reverse of Number is : %d ",*pr) ;
}