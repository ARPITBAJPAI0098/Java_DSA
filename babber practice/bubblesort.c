#include<stdio.h>

void bubblesort(int arr[],int n)
{
    int i;
    for(i=0;i<=n;i++)
    {
        int j;
        for(j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                 // swap the number
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;  

            }
        } 
    }
}
int main()
{
    int n=7;
    int arr[7]={7,6,5,4,3,2,1};
    bubblesort(arr,7);
    for( int i=0;i<=n;i++)
    {
        printf("%d",arr[i]);
    }
    return 0;
}