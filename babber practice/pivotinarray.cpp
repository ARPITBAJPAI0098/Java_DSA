#include<iostream>
using namespace std;
int getpivot(int arr[],int n)
{
    int s=0;
    int e=n-1;
    int mid=s+(e-s)/2;

    while(s<e)
    {
        if(arr[mid]>arr[0])
        {
            s=mid+1;
        }
        else{
            e=mid;// we not use mid-1 as in such cases we get jump to the next line of which element we donot 
        }
        mid=s+(e-s)/2;
    }
    return s;
}
int main(){
    int arr[5]={8,10,17,1,3};
    //we assume pivot element aas the minimum element of the rotated array 
    int index=getpivot(arr,5);
    cout<<"the pivot element is"<<index<<endl;
    // in answer we are getting the index of the pivot element
}