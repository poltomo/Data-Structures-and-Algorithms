// 203
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
package LeetCode;
class LinkedListRemove {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0,head);
        ListNode prev=sentinel;
        ListNode curr=sentinel.next;
        while (curr!=null){
            if (curr.val==val){
                prev.next=curr.next;
            } else {
                prev=curr;
            }
            curr=curr.next;
        }
        return sentinel.next;
    }
}
