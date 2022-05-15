package leetcode.problem1

class Driver {
    init {
        val input = intArrayOf(3, 3)
        val target = 6
        println(Solution3().twoSum(input, target).joinToString())
    }
}

class Solution3 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap: HashMap<Int, Int> = HashMap()

        nums.forEachIndexed { index, value ->
            hashMap[target - value]?.let {
                return intArrayOf(index, it)
            }
            hashMap[value] = index
        }

        return intArrayOf()
    }
}

class Solution2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = nums.mapIndexed { index, value ->
            value to index
        }.toMap()

        nums.forEachIndexed { index, value ->
            val find = target - value
            hashMap[find]?.let {
                if (index != it)
                    return intArrayOf(index, it)
            }
        }
        return intArrayOf()
    }
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index1, it1 ->
            val nextArrayStarting = index1 + 1
            nums.drop(nextArrayStarting).forEachIndexed { index2, it2 ->
                if (it1 + it2 == target)
                    return intArrayOf(index1, index2 + nextArrayStarting)
            }
        }
        return intArrayOf()
    }
}