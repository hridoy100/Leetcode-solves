/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // keep track of the head of the new list, and the tail to add on to
        ListNode head = new ListNode();
        ListNode tail = head;
        
        // iterate until we reach the end of one list
        while(l1!=null && l2!=null){
            // compare the heads of both lists
            if(l1.val < l2.val){
                tail.next = l1;
                l1=l1.next;
            }
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        tail.next = l1==null? l2:l1;
        return head.next;
    }
    // time complexity O(m+n)
    // space complexity O(1)
}