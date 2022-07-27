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
    public ListNode reverse(ListNode head){
        if(head==null)return null;
        ListNode prev=null,curr=head,next=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //find node before mid so that we can have connection
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        ListNode start=head;
        ListNode mid=slow.next;
        while(mid!=null){
            if(mid.val!=start.val)return false;
            start=start.next;
            mid=mid.next;
            
        }
        return true;
    }
}