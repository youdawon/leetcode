class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        
        count = 0
        currSum = 0
        currSize = 0
        left = 0
        for right in range(len(arr)):
            currSum += arr[right]
            currSize += 1

            if currSize == k+1:                
                currSum -= arr[left]
                currSize -= 1
                left += 1

            if k == currSize and currSum // (right-left+1) >= threshold:
                count += 1

        return count