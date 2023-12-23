
// code by Puneet
// PLease visit explanation file to understand the code and approach

// Question asked in Amazon, BloomBerg and Salesforce
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(j < t.length()){
            // if substring found only if i matches the length of String s
            if(i == s.length()){
                break;
            }else if (s.charAt(i) == t.charAt(j)){
                j++;
                i++;
            }else{
                j++;
            }

        }
        // if substring found true, else false
        return i == s.length();
    }
}
