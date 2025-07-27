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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start=head;
        for(int i=1;i<k;i++){
            start=start.next;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        
        while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
        }
        int temp=start.val;
        start.val=slow.val;
        slow.val=temp;

    
    return head;
}
}