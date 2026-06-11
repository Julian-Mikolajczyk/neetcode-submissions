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
  public boolean hasCycle(ListNode head) {
    ListNode slower = head;
    ListNode faster = head;

    while(faster != null && faster.next != null){
      faster = faster.next.next;
      slower = slower.next;
      if(faster == slower){
        return true;
      }
    }
    return false;
  }
}
