// 206
package LeetCode;
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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode pointer = head.next;
        ListNode newHead = new ListNode(head.val);
        
        while (pointer!=null){
            newHead=new ListNode(pointer.val,newHead);
            pointer=pointer.next;
        }
        return newHead;
    }
}
