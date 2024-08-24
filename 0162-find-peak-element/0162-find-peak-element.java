class Solution {
    public int findPeakElement(int[] nums)
    {
        int temp=0,max=0,c=0;
        int i,j,result =0;



        // if(nums.length==2)
        // {
        //     if(nums[0]>nums[1])
        //     {
        //         return 0;
        //     }
        //     if(nums[1]>nums[0])
        //     {
        //         return nums[0];
        //     }
            
        // }
        max=nums[0];
        for(i=0;i<nums.length;i++)
        {
            // for(j=i+1;j<nums.length;j++)
            // {
                
                if(max<nums[i])
                {
                    max=nums[i];
                    result=i;
                    
                    // result=nums[i-1];
                    // if(result==Integer.MIN_VALUE)
                    // {
                    //     return 1;
                    // }

                }
            // }
            
        }
        return result;
        
    }
}