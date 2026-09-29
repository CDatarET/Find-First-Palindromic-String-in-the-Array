class Solution {
    private boolean isPal(String s){
        int j = s.length() - 1;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(j--)){
                return false;
            }
        }

        return true;
    }
    
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(isPal(words[i])){
                return words[i];
            }
        }

        return "";
    }
}
