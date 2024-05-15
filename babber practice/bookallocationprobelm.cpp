#include<iostream>
using namespace std;
int minthree(int max1,int max2,int max3)
{
    int min=max1;
    if(max2<min)
    {
        min=max2;
    }
    else if(max3<min)
    {
        min=max3;
    }
    else{
        min=max1;
    }
    return min;
}
int caseone()

int main()
{
    int compare=minthree(10,20,30);
    cout<<"the min among max is"<< compare<< endl;
    int N;
    cout<<"enter the N"<< endl;
    cin>>N;
    int arr[N];
    cout<<"enter the elements"<<endl;
    for(int i=0;i<=N;i++)
    {
        cin>>arr[i];
    }
    
    for( int i=0;i<=N;i++)
    {
        cout<< arr[i] <<endl;
    }
    return 0;
}