#include<iostream>
using namespace std;
int binarysearch(int n)
{
    int s=0;
    int e=n;
    int mid=s+(e-s)/2;

    int ans=-1;
    while(s<=e)
    {
        int square=mid*mid;
        if(square==n)
        {
        return mid;
        }
        if(square<n)
        {
            ans=mid;
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;
    }
    return ans;
}
int mysqrt(int n)
{
    return binarysearch(n);
}
int main()
{
    cout<<"the sqrt of number is"<<mysqrt(6)<<endl;
}


// here in this case there is not a exact answer so..