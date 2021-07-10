package CodingTest.LeetCode.LinkedList.Easy;

import java.util.HashSet;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
*/
public class LinkedListCycle {
    /*Floyd's Cycle Finding Algorithm
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    */
    /*floyd cycle algo
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode prev = head, next = head.next;
    
        while(next.next != null && next.next.next != null){
            prev = prev.next;
            next = next.next.next;
            
            if(prev == next) return true;
        }
        
        return false;
    }
    */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        while(head != null){
            if(set.contains(head)) return true;
            else set.add(head);
            
            head = head.next;
        }
        
        return false;
    }
}