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
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast= head;
        while (fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode reverse= rev (slow);
        ListNode first = head;

        while (reverse!= null){
            if(first.val != reverse.val){
                return false;
            }
            first=first.next;
            reverse=reverse.next;
        }
        return true;


    }
    public ListNode rev(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode ans = rev(head.next);
        head.next.next=head;
        head.next=null;

        return ans;
    }
}