#include<iostream>
using namespace std;

int binarysearch(int arr[],int size,int key){
    int start=0;
    int end=size-1;

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


int main(){
    int even[6]={2,4,6,8,10,12};
    int odd[6]={1,3,5,7,9,11};
    int index=binarysearch(even,6,11);
    cout<<" index of 12 is" << index <<endl;






    return 0;
}


