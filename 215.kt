import java.util.PriorityQueue
import java.util.Queue

/*
215. Kth Largest Element in an Array

Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
Idea: -
Runtime: 429ms
Beats: 66.13%

*/

class Solution215 {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        // Create priority queue
        val cmp = Comparator<Int> { p1, p2 ->
            p1 - p2
        }
        val heap : Queue<Int> = PriorityQueue(k, cmp)
        for (num in nums) {
            if (heap.size == k) {
                if (heap.peek() < num) {
                    heap.add(num)
                    heap.poll()
                }
            } else {
                heap.add(num)
            }
        }
        return heap.peek();
    }
}
