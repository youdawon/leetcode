class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        
        left = 0
        right = len(people)-1

        people.sort(reverse=True)

        while left <= right:
            if people[left] + people[right] <= limit:
                right -= 1
            left += 1
            print(left, right)
        
        return left