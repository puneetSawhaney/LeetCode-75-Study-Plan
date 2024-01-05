// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public int maxVowels(String s, int k) {
        
        int ans = 0;
        int count = 0;
        // for 1st window vowel count
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        ans = count;
        // release 1st element and acquire ith element
        for(int i =k; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
    // is vowel function to check whether ch is vowel or not
    public boolean isVowel(char ch){
        if(ch=='a'){
            return true;
        }else if(ch=='e'){
            return true;
        }else if(ch=='i'){
            return true;
        }else if(ch=='o'){
            return true;
        }else if(ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}
