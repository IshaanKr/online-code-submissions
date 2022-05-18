class Solution:
     def maxArea(self, height: List[int]) -> int:
        ans = 0
        for i in range(len(height)):
            for j in range(i, len(height)):
                ans = max(j-i * min(height[i], height[j]),max)
        return ans

