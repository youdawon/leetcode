class Solution:
    def characterReplacement(self, s, k):

        maxLength, mostFreqCount = 0, 0
        arr = collections.Counter()

        for i in range(len(s)):
            arr[s[i]] += 1
            ## 가장 빈번한 데이터수 추출
            mostFreqCount = max(mostFreqCount, arr[s[i]])
            
            if maxLength - mostFreqCount >= k:
                arr[s[i-maxLength]] -= 1
            else:
                maxLength += 1

        return maxLength