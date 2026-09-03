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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
        }
        //we found middle - slow
        ListNode secondHalf = slow.next;
        ListNode prev = slow.next = null;
        while(secondHalf != null){
          ListNode temp = secondHalf.next;
          secondHalf.next = prev;
          prev = secondHalf;
          secondHalf = temp;
        }
        //we rotated second half of array now we have to combine

        ListNode firstHalf = head;
        secondHalf = prev;
        while(secondHalf != null){
          ListNode tmp1 = firstHalf.next;
          ListNode tmp2 = secondHalf.next;
          firstHalf.next = secondHalf;
          secondHalf.next = tmp1;
          firstHalf = tmp1;
          secondHalf = tmp2;
        }
    }
}
