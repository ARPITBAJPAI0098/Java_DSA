#include<iostream>
using namespace std;
int pivotsearch(int arr[],int n)
{
    int s=0;
    int e=n-1;
    int mid=(e+s)/2;
    while(s<e)
    {
        if(arr[mid]>arr[0])
        {
            s=mid+1;
        }
        else if(arr[mid]<arr[0])
        {
            e=mid;
        }
        else{
            return -1;
        }
        mid=(e+s)/2;

    }
    return s;
}
int binarysearch(int arr[],int s,int e,int key){
    int start=s;
    int end=e;

    int mid=(start+end)/2;
      //mid=start+(end-start)/2;
        // use this instead of above mid=start+(end-start)/2

    // in the interview or while applying in leetcodde or in any other platform 
    // put mid=s+(e-s)/2 because we know that range of the intergere that correspond to both s and e is 2^31-1 
    // therefore here if we taken mid=(s+e)/2 the mid will get out of range ..therefore we use above mid form
    while(start<=end){
        if(arr[mid]==key){
            return mid;
        }
        //go to the right or left according toi the condition
        if(key>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2;

        //mid=start+(end-start)/2;
        // use this instead of above mid=start+(end-start)/2
        
    }
    return -1;
}
int findposition(int arr[],int n,int key)
{
    int pivot=pivotsearch(arr,n)
    if( k>=arr[pivot] && k<=arr[n-1] )
    {
        return binarysearch(arr,pivot,n-1, key);
    }
    else{
        return binarysearch(arr,0,pivot-1,3);
    }
}
int main()
{
    int arr[5]={1,3,10,3,9};
    cout<<"the pivot element is at index"<<findposition(arr,5,3)<<endl;
}


