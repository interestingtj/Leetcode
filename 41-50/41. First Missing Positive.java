class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int a=1;
        for(int i:nums)
        {
            if(i<0)
                continue;
            if(a==i)
                a++;
            else if(i>a)
                return a;
        }
        return a;
    }
}