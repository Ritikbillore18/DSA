#include<stdio.h>
#include<conio.h>
// Binary search //
void main()
	{
		int a[]={10,20,30,40,50,60,70,80,90,100};
		int low=0,high=9,mid,n,f=0;
		clrscr();
		printf("print value between 10 to 100 \n ");
		printf("Enter a value of n");
		scanf("%d",&n);
		while(low<=high)
			{
			  mid=(low+high)/2;
			   if(a[mid]==n)
			  {
			    f=1;
			    break;
			  }
			  else if(n>a[mid])
			  {
			   low=mid+1;
			  }
			  else
			  {
			   high=mid-1;
			  }
			}
			if(f==1)
			{
			 printf("Element Found");
			}
			else
			{
			 printf("Not Found");
			}
			getch();
	}