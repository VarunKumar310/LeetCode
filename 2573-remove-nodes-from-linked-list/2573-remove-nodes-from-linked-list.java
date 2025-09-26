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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy,curr=head;
        int maxi=Integer.MIN_VALUE;
        while(curr!=null){
            if(curr.val>=maxi){
                maxi=curr.val;
                tail.next=curr;
                tail=tail.next;
            }
            curr=curr.next;
        }
            tail.next=null;
            return reverse(dummy.next);
    }
        private ListNode reverse(ListNode head){
            ListNode prev=null,cur=head;
            while(cur!=null){
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            return prev;
        }
    
}