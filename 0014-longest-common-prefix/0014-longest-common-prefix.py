class Solution:

    def longestCommonPrefix(self, strs: List[str]) -> str:

        if len(strs) == 1:
            return strs[0]

        prefix = ""

        for i in range(len(strs[0])):
            prev = strs[0][:i+1]
            for j in range(1, len(strs)):
                if not strs[j].startswith(prev):
                    break

                if strs[j].startswith(prev) and j == len(strs) - 1:
                    prefix = prev

        return prefix 