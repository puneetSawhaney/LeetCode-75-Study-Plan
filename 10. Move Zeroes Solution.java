// code by Puneet
// PLease visit explanation file to understand the code and approach

// question asked in facebook, yandex and Apple
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        // 0 to j-1 => all nonzeroes
        //j to i-1 => all zeroes
        // i to end => unknown

        // used quicksort algorithm
        while(i < nums.length){
            if(nums[i]==0){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }
}
