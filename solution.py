class Solution:
    def isPalindrome(self, s):
        return s == s[::-1]

    def firstPalindrome(self, words: list[str]) -> str:
        for word in words:
            if self.isPalindrome(word):
                return word
        
        return ""
