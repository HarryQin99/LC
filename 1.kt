/*
1. Two Sum

Link: https://leetcode.com/problems/two-sum/description/
Idea: -
Runtime: 216ms
Beats: 53.20%

*/

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val record = HashMap<Int, Int>()
        for ((index, value) in nums.withIndex()) {
            if (record.containsKey(value)) {
                return intArrayOf(index, record[value]!!)
            }
            record[target - value] = index
        }
        return intArrayOf(-1, -1)
    }
}