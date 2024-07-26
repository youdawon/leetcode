class Solution:
    def partition(self, s: str) -> List[List[str]]:

        self.res = []

        def backtracking(i, current):

            if i == len(s):
                self.res.append(current.copy())
                return

            for j in range(i, len(s)):
                if self.isPalindrome(s[i:j+1]):
                    current.append(s[i:j+1])
                    backtracking(j+1, current)
                    current.pop()

        backtracking(0, [])

        return self.res

    def isPalindrome(self, s):

        left = 0
        right = len(s)-1

        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        
        return True

