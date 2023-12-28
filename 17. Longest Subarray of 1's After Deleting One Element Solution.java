// code by puneet
// please visit explanation file to understand the approach I followed
// Amazon & Apple
class Solution {
    public int longestSubarray(int[] nums) {
        
        int result =0;

        int i =0;
        int j =-1;
        int ZeroCount =0;
        while(i < nums.length){
            if(nums[i]== 0){
                i++;
                ZeroCount++;
            }else{
                i++;
            }

            while(ZeroCount > 1 && j < i){
                j++;
                if(nums[j] == 0){
                    ZeroCount--;
                }
            }
            result = Math.max(result, i-j-1);
        }
        return result-1;
    }
}
