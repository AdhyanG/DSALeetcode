/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null|| head.next==null){
            return null;
        }
        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
            if(hare==turtle){
                break;
            }
        }
        if(hare==null||hare.next==null)return null;
        hare=head;
        while(hare!=turtle){
            hare=hare.next;
            turtle=turtle.next;
        }
        return hare;
        
    }
}