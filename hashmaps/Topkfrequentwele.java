import java.util.*;


class Topkfrequentele{
    public static int []topfreq(int nums[],int k)
    {
        // map diagram found the frequency of element
        HashMap<Integer,Integer>hp=new HashMap<>(null);
        for(int el:nums)
        {
            if(!hp.containsKey(el))
            {
                hp.put(el, 1);
            }
            if(hp.containsKey(el))
            {
                hp.put(el, hp.get(el)+1);
            }
        }
        // make an array of name ans store the   element of specific frequency  at that index
        List<Integer>ans=new List[nums.length+1];
        for(int key:hp.keySet())
        {
            int frequency=hp.get(key);
            if(ans[frequency]==0)
            {
                // now create arraylist as more than one ele can have the same freq
                ans[frequency]=new ArrayList<>();
            }
            ans[frequency].add(key);
        }
        
        
    }

}