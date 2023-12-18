// code by puneet
// please visit explanation file to understand the approach I followed

// question asked in amazon, facebook and Adobe interview

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int max = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        
        for(int i =0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                continue;
            }else if (firstIndex == -1){
                firstIndex = i;
                lastIndex = i;

            }else{
                lastIndex = i;
            }
        }
        // if all are zeroes    
        if(firstIndex == -1){
            return n <= (flowerbed.length+1)/2;
        }

        max = firstIndex/2;  // left side 
        max += (flowerbed.length - lastIndex -1)/2 ;  // right side 

        // middle
        int count =0;
        for(int i = firstIndex+1; i <= lastIndex; i++){
            if(flowerbed[i] == 0){
                count++;
            }else{
                max += (count -1)/2;
                count =0;
            }
        }

        max += (count-1)/2;
        return n <= max;
    }
}
