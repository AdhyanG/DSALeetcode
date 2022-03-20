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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
            
        }
        ListNode slow=head;
        ListNode temp=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode left_side=sortList(head);
        ListNode right_side=sortList(slow);
        return mergeList(left_side,right_side);
        
    }
    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null){
            curr.next=l1;
            l1=l1.next;
            
        }
        if(l2!=null){
            curr.next=l2;
            l2=l2.next;
        }
        return temp.next;
    }
}