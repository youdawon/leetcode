class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        
        count = 0

        currSum = sum(arr[:k])

        if currSum / k >= threshold:
            count += 1
        
        for i in range(k, len(arr)):
            currSum += arr[i] - arr[i-k]

            if currSum / k >= threshold:
                count += 1
        
        return count