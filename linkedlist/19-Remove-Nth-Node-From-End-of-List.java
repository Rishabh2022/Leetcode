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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
        ListNode fast=head;
        ListNode slow=head;

        for(int i=0;i<n;i++) fast=fast.next;
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }

        ListNode del=slow.next;
        slow.next=slow.next.next;
        return head;



        // int len = 1;
        // ListNode temp = head;
        // while (temp != null && temp.next != null) {
        //     temp = temp.next;
        //     len++;
        // }
        // if (len == 1) return null;
        // int k = len - n + 1;
        // int j = 1;
        // if (k == 1) return head.next;
        // temp = head;
        // while (j != k - 1 && temp != null) {
        //     temp = temp.next;
        //     j++;
        // }
        // if (temp.next != null)
        //     temp.next = temp.next.next;
        // return head;


        
    }
}