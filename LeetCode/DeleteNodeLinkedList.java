// 237
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
        while (curr.next!=null){
            curr.val=curr.next.val;
            curr=curr.next;
        }
        curr=node;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
}
