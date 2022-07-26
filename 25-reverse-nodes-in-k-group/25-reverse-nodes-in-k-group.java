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
    public void reverse(ListNode start,ListNode end){
        ListNode prev=null,curr=start,next=start.next;
        while(prev!=end){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)next=next.next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k==1)return head;
        ListNode start=head,end=head;
        int count=k-1;
        while(count>0){
            end=end.next;
            if(end==null)return head;
            count--;
        }
        ListNode newHead=reverseKGroup(end.next,k);
        reverse(start,end);
        start.next=newHead;
        return end;
    }
}