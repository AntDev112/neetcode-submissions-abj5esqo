class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        word = ""
        secondWord = ""
        if len(s) < len(t):
            word = t
            secondWord = s
        else:
            word = s
            secondWord = t
        letterCount = {letter:word.count(letter) for letter in set(word)}
        print(letterCount)
        for letter in secondWord:
            if letter in letterCount:
                letterCount[letter] -= 1
                if letterCount[letter] <= 0:
                    del letterCount[letter]
        
        print(letterCount)
        return len(letterCount) == 0
            
            