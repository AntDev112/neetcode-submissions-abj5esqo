class Solution:
    def validWordAbbreviation(self, word: str, abbr: str) -> bool:
        apointer = 0
        bpointer = 0

        while apointer < len(abbr):
            curr = abbr[apointer]

            if curr == "0":
                return False

            if curr.isdigit():
                jumps, apointer = self.getDigit(abbr, apointer)
                bpointer += jumps

                if bpointer > len(word):
                    return False

                continue

            if bpointer >= len(word):
                return False

            if abbr[apointer] != word[bpointer]:
                return False

            apointer += 1
            bpointer += 1

        return bpointer == len(word)

    def getDigit(self, abbr: str, i: int):
        res = 0

        while i < len(abbr) and abbr[i].isdigit():
            res = res * 10 + int(abbr[i])
            i += 1

        return res, i