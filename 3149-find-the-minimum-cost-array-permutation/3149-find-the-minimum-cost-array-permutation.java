class Solution {
    int n;
    int res=Integer.MAX_VALUE;
    int vis[];
    List<Integer> ans=new ArrayList<>();
    private void solve(int[] nums,int score,List<Integer> perm){
        if(res<score)return;
        if(perm.size()==n){
            score+=Math.abs(perm.get(perm.size()-1)-nums[perm.get(0)]);
            if(res>score){
                res=score;
                ans=List.copyOf(perm);
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]!=1){
                vis[i]=1;
                perm.add(i);
                int s=perm.size();
                
                solve(nums,score+Math.abs(perm.get(perm.size()-2)-nums[perm.get(perm.size()-1)]),perm);
                perm.remove(perm.size()-1);
                vis[i]=0;
            }
        }
    }
    public int[] findPermutation(int[] nums) {
        n=nums.length;
        vis=new int[n];
        List<Integer> perm=new ArrayList<Integer>();
        perm.add(0);
        vis[0]=1;
        solve(nums,0,perm);
        int[] ans1=new int[n];
        for(int i=0;i<ans.size();i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}