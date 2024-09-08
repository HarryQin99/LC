/*
206. Reverse Linked List

Link: https://leetcode.com/problems/reverse-linked-list/description/
Idea: -
Runtime: 161ms
Beats: 52.14%

*/


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution206 {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr: ListNode? = head
        while (curr != null) {
            var next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }

}
