// question asked in Amazon, facebook, google
class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxOnes = 0;
        int ZeroCount =0;
        int i =0;
        int j =-1;

        while(i < nums.length){
            // acquire 
            if(nums[i]==0){
                ZeroCount++;
                i++;
            }else{ // currentNumber is 1
                i++;
            }
            // release till you won't get the suitable window
            while(ZeroCount > k){
                j++;
                if(nums[j] == 0){
                    ZeroCount--;
                }
            }

            // consider current element
            int SizeOfWindow = i-1-j;
            maxOnes = Math.max(SizeOfWindow, maxOnes);
        }
        return maxOnes;
    }
}
