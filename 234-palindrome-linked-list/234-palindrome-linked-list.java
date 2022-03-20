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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middlelist(head);
        ListNode secondHead=reverseList(mid);
        ListNode reverseHead=secondHead;
        while(head!=null&&secondHead!=null){
            if(head.val!=secondHead.val){
                break;
            }
            head=head.next;
            secondHead=secondHead.next;
            
        }
        reverseList(reverseHead);
        return (head==null||secondHead==null);
        
    }
    public ListNode middlelist(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}