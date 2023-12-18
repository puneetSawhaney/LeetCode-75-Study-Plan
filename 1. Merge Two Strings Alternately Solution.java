// code by puneet
// please visit explanation file to understand the approach I followed


// question asked in Amazon Apple Google

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merge = new StringBuilder();
        int i =0, j =0;
        boolean flag = true;
        while(i < word1.length() && j <word2.length()){
            if(flag){
                 merge.append(word1.charAt(i));
                 i++;
            }
            else{
                 merge.append(word2.charAt(j));
                 j++;
            }
            flag = !flag;
        }
        while(i < word1.length()){
            merge.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            merge.append(word2.charAt(j));
            j++;
        }
        return merge.toString();    
    }
}
