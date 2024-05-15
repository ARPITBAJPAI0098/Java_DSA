package oopsimport;

public class sortedarray {
    public static boolean issorted(int arr[]){
        if(arr.length==1)
        {
            return true;
        }
        int temp[]=new int[arr.length-1];
        for(int i=1;i<=arr.length-1;i++)
        {
            temp[i-1]=arr[i];
        }
        boolean smallans= issorted(temp);
        if(!smallans)
        {
            return false;
        }
        if(arr[0]<=arr[1])
        {
            return true;
        }
        else{
            return false;
        }
    }
}
// by recursion
