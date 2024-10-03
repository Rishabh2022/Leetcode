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
    public boolean hasCycle(ListNode head) {
        //https://leetcode.com/problems/linked-list-cycle/submissions/1410039179/

        ListNode slowpointer=head,fastpointer=head;

        while(fastpointer!=null && fastpointer.next!=null  ){
            slowpointer=slowpointer.next;
            fastpointer=fastpointer.next.next;
            if(slowpointer==fastpointer){
                return true;
            }


        }
        return false;

        
    }
}