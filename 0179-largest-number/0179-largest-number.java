class Solution {
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        int i,j;
        int temp=0,f=0;
        if (n==1)
        {
            return String.valueOf(nums[0]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                String first=String.valueOf(nums[i]);
                String sec=String.valueOf(nums[j]);
                String front=first+sec;
                String last=sec+first;

                // long start=Long.parseLong(front);
                // long end=Long.parseLong(last);

                if(front.compareTo(last)>0)

                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    
                }

                if(nums[i]!=0)
                {
                    f=1;
                }



            }
        
        
        }
        if(f==0)
         {
           return"0";
         }

        String str="";
        for(i=0;i<n;i++)
        {
          str=str+String.valueOf(nums[i]);
        }
        return str;
    }
}