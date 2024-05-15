#include<iostream>
using namespace std;

int firstocc(int arr[],int size,int key){
    int start=0;
    int end=size-1;
    int mid=(start+end)/2;
    int ans=-1;
    while(start<=end)
    {
        if(arr[mid]==key){
            ans=mid;
            end=mid-1;

        }
        else if(key>arr[mid])
        {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2; 
    }
    return ans;
}

    int lastocc(int arr[],int size,int key){
    int start=0;
    int end=size-1;
    int mid=(start+end)/2;
    int ans=-1;
    while(start<=end)
    {
        if(arr[mid]==key){
            ans=mid;
            start=mid+1;//ek bar index milne ke baad hame lastocc me sswitch krna hai so start=end+1

        }
        else if(key>arr[mid])
        {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2;
    }
    return ans;
}
int main(){
    int N;
    cout<<"enter the number of element in array"<<endl;
    cin>>N;
    int arr[N];
    cout<<"enter the inputs"<< endl;
    for (int i=0;i<=N;i++)
    {
        cin>>arr[i];

    }
    int index=firstocc(arr,N+1,3);
    int indexrhs=lastocc(arr,N+1,3);
    int totalocc;
    totalocc=(indexrhs-index)+1;
    cout<<"first occurance of 3 is" << index <<endl;
    cout<<"last occurance of 3 is" << indexrhs <<endl;
    cout<<"total occurance of 3 is" << totalocc <<endl;
    return 0;
}