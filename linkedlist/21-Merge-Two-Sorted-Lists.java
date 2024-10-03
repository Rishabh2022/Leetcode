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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       // https://leetcode.com/problems/merge-two-sorted-lists/


        if(list1 == null) return list2;
\t\tif(list2 == null) return list1;
\t\tif(list1.val < list2.val){
\t\t\tlist1.next = mergeTwoLists(list1.next, list2);
\t\t\treturn list1;
\t\t} else{
\t\t\tlist2.next = mergeTwoLists(list1, list2.next);
\t\t\treturn list2;
\t\t}


        // ListNode tail=new ListNode(0);
        // ListNode u=tail;
        // ListNode a=list1;
        // ListNode b=list2;
        // while(a!=null && b!=null){
        //      if(a.val<b.val){
        //             tail.next=a;
        //             a=a.next;
        //      }
        //      else{
        //         tail.next=b;
        //         b=b.next;
        //      }
        //      tail=tail.next;
        // }

        // if(a!=null && b==null){ tail.next=a;}
        // else if(a==null && b!=null){ tail.next=b;}

        // return u.next;
        
    }
}