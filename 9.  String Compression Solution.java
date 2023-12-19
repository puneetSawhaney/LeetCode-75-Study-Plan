// code by Puneet 
// please visit to explanation file of this code to understand the approach

class Solution {
    public int compress(char[] chars) {
        
        int i =1;
        int count =1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        while(i <chars.length){
            if(chars[i]== chars[i-1]){
                count++;
            }else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(chars[i]);
                count=1;
            }
            i++;
        }
        if(count>1){
            sb.append(count);
        }
        for(int j=0; j < sb.length(); j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}
