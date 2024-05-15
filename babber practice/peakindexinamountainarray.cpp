#include<iostream>
using namespace std;
int peakindex(int arr[],int size){
    int start=0;
    int end=size-1;
    int mid=(start+end)/2;
    while (start<end)
    {
        if(arr[mid]<arr[mid+1])
        {
            start=mid+1;
        }
        else{
            end=mid;//here we donot put mid-1 as it will get switch to the left part  of the mountain
        }
        mid=(start+end)/2;
    }
    return start;
}

int main()
{
    int arr[5]={1,2,6,5,3};
    int peaks=peakindex(arr,5);
    cout<<"max element is"<<peaks<<endl;
}