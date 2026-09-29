class Solution {
public:
    bool isPal(string s){
        int j = s.size();
        for(int i = 0; i < s.size() / 2; i++){
            if(s[i] != s[--j]){
                return false;
            }
        }

        return true;
    }

    string firstPalindrome(vector<string>& words) {
        for(string s : words){
            if(isPal(s)){
                return s;
            }
        }

        return "";
    }
};
