class Solution:
    def totalFruit(self, fruits: List[int]) -> int:

        basket = collections.defaultdict(int)
        basketCount = 2
        num = 0
        
        left = 0
        for right in range(len(fruits)):
            basket[fruits[right]] = basket.get(fruits[right], 0) + 1

            while len(basket) > basketCount:
                basket[fruits[left]] = basket[fruits[left]] - 1                
                if basket[fruits[left]] == 0:
                    del basket[fruits[left]]
                left += 1

            num = max(num, right-left+1)

        return num