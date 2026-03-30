class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramsMap = {}
        anagrams = []
        for i in range(len(strs)):
            sorted_word = ''.join(sorted(strs[i]))
            print(sorted_word)
            if sorted_word not in anagramsMap:
                anagramsMap[sorted_word] = [strs[i]]
            else:
                anagramsMap[sorted_word].append(strs[i])
        for anagram in anagramsMap:
            anagrams.append(anagramsMap[anagram])

        return anagrams

     

       
        