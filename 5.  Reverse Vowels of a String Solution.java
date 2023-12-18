// code by puneet
// please visit explanation file to understand the approach I followed

// question asked in Amazon, apple, bloomberg
class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int li = 0;
        int ri =s.length()-1;

        while(li < ri){
           if(isVowel(arr[li]) && isVowel(arr[ri])){
               char ch = arr[li];
               arr[li] = arr[ri];
               arr[ri] = ch;
               li++;
               ri--;
           }else if(isVowel(arr[li])){
               ri--;
           }
           else if(isVowel(arr[ri])){
               li++;
           }else{
               li++;
               ri--;
           }
        }

        return new String(arr);
    }

    public boolean isVowel(char ch){
        if(ch == 'a' || ch =='A'){
            return true;
        }
        else if(ch == 'e' || ch =='E'){
            return true;
        }
        else if(ch == 'i' || ch =='I'){
            return true;
        }
        else if(ch == 'o' || ch =='O'){
            return true;
        }
        else if(ch == 'u' || ch =='U'){
            return true;
        }else{
            return false;
        }
    }
}
