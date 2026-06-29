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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode combine = null;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode current1 = list1;
        ListNode current2 = list2;

        while(current1 != null && current2 != null){
            if(current1.val<current2.val){
                tail.next = new ListNode(current1.val);
                tail = tail.next;
                current1 = current1.next;
            } else{
                tail.next = new ListNode(current2.val);
                tail = tail.next;
                current2 = current2.next; 
                }
        }
        if (current1 != null) {
            tail.next = current1;
        }
        if (current2 != null) {
            tail.next = current2;
        }
        return dummy.next;
    }
}