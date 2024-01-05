// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // frequency check map
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // store frequencies in HashMap
        for(int val: arr){
            // if(freqMap.containsKey(val)){
            //     // increase frequency if already exists
            //     freqMap.put(val, freqMap(val) + 1)
            // }else{
            //     reqMap.put(val,  1)
            // }
            // above if else statement can be written as

            freqMap.put(val, freqMap.getOrDefault(val, 0) +1);
        }

        // HashSet For find out duplicate frequencies
        HashSet<Integer> unique = new HashSet<>();
        for(int freq: freqMap.values()){
            if(unique.contains(freq)){
                return false;
            }else{
                unique.add(freq);
            }
        }
        return true;
    }
}
