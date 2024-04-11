class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        maxi=0
        a=0
        for i in gain:
            a+=i
            if(a>maxi):
                maxi=a
        return maxi
            