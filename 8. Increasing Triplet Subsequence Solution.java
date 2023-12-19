// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int firstSmall = Integer.MAX_VALUE;
        int SecondSmall = Integer.MAX_VALUE;

        for(int i =0; i < nums.length; i ++){
            if(nums[i] <= firstSmall){
                firstSmall = nums[i];
            }else if(nums[i] <= SecondSmall){
                SecondSmall = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}
