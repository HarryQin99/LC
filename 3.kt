/*
3. Longest Substring Without Repeating Characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Idea: -
Runtime: 203ms
Beats: 67.22%

*/

import kotlin.math.*

class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var res = 0
        var start = 0
        val record = HashMap<Char, Int>()
        for ((index, value) in s.withIndex()) {
            start = max(start, record.getOrDefault(value, -1))
            record[value] = index + 1
            res = max(res, index - start + 1)
        }
        return res
    }
}