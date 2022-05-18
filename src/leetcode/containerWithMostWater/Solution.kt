package leetcode.containerWithMostWater

import kotlin.math.max
import kotlin.math.min


class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.size-1
        while(left<right){
            val width = right - left
            max = max(width * min(height[left], height[right]), max)

            if(height[left]<=height[right])
                left++
            else right--
        }
        return max

    }
}


class Driver {
    init {
        val input = intArrayOf(3, 3)
        println(Solution().maxArea(input))
    }
}