class Solution {
    public int searchInsert(int[] nums, int target) {
        int found=0,target2=nums[nums.length-1];
        if(target>target2)
        {
            found= nums.length;
        }
        else{
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]>=target)
            {
                found=i;
                break;
            }
       
                
    }
        }
    return found;
}
}
