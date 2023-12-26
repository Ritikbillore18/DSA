#include<stdio.h>
#include<conio.h>
// Bubble Sort //
void main()
{
	int a[]={30,40,20,50,10};
	int i,j,temp;
	clrscr();
	printf("Before Sorting element are:\n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a[i]);
	}
	for(i=0;i<5;i++)
	{
	  for(j=0;j<5-1;j++)
	  {
	    if(a[j]>a[j+1])
	    {
	     temp=a[j];
	     a[j]=a[j+1];
	     a[j+1]=temp;
	    }
	  }
	}
	printf("After Sorting \n");
	for(i=0;i<5;i++)
	{
	 printf("%d\t",a[i]);
	}
	getch();
}