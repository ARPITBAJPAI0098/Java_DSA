#include<stdio.h>
// we are repplacing the element of an arry with the least of another one array takingv
int main()
{
    int n=7;
    int arr[n]={7,6,5,4,3,2,1};
    for(int i=0;i<=n;i++)
    {
        int min=arr[i];
        int min_index=-1;
        for( int j=i;j<n;j++)
        {
            if(arr[j]<min)
            {
                min_index=j;
                min=arr[j];
            }
        }
        
        // swap the number
        int temp;
        temp=arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp;  

    }printf("\n");
    printf("sorted array:\n");
    for(int i=0;i<n;i++)
    {
        printf("%d",arr[i]);

    }
    return 0;
}
