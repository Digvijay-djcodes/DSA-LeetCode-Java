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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            head=head.next;
            head=removeElements(head,val);
        }
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode second=head.next;
        while(second!=null){
            if(second.val==val){
                temp.next=temp.next.next;
                head=removeElements(head,val);
            }
            temp=second;
            second=second.next;

        }
        return head;
        }
        
    }
