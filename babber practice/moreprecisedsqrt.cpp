#include<iostream>
using namespace std;
int sqrtsearch(int n)
{
    int s=0;
    int e=n;
    int mid=s+(e-s)/2;
    int ans=-1;
    while(s<=e)
    {
        int square=mid*mid;
        if(n==square)
        {
            return mid;

        }
        if(square<n)
        {
         
            s=mid+1;
        }
        if(square>n)
        {
            e=mid;
        }
        mid=s+(e-s)/2;;
    }
    return ans;
}
double moreprecise(int n,int precision,int show)
{
    double factor=1;
    double ans=show;
    for(int i=0;i<precision;i++)
    {
        factor=factor/10;
        for(double j=ans;j*j<n;j=j+factor)
        {
            ans=j;
        }
    }
    return ans;
}
int main()
{
    int show=sqrtsearch(48);
    cout<<"the acccurate ans is"<<moreprecise(48,3,show) << endl;

    return 0;
}
// what is the errror