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
    public ListNode mergeList(ListNode list1,ListNode list2){
        if(list1==null)return list2;
        if(list2==null)return list1;
        if(list1.val<list2.val){
            list1.next=mergeList(list1.next,list2);
            return list1;
        }
        else{
            list2.next=mergeList(list1,list2.next);
            return list2;
        }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy=new ListNode(-1);
        // ListNode head=dummy;
        // while(list1!=null&&list2!=null){
        //     if(list1.val<list2.val){
        //         dummy.next=list1;
        //         list1=list1.next;
        //     }
        //     else{
        //         dummy.next=list2;
        //         list2=list2.next;
        //     }
        //     dummy=dummy.next;
        // }
        // if(list1!=null){
        //     dummy.next=list1;
        // }
        // else{
        //     dummy.next=list2;
        // }
        // return head.next;
        
        // recursion approach
        return mergeList(list1,list2);
        
        
        
        
    }
}