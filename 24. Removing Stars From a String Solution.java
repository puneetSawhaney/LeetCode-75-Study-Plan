// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public String removeStars(String s) {  
        // Initialize an StringBuilder to build the modified string.
        StringBuilder sc = new StringBuilder();
        // Loop through each character i in the input string s.
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                // remove left character
                sc.deleteCharAt(sc.length()-1);
            }else{
                // append char to stringBuilder
                sc.append(s.charAt(i));
            }
        }
        return sc.toString();
    }
}
