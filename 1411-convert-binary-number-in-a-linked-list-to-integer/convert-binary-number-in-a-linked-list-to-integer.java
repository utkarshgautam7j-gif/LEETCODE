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
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        StringBuilder s= new StringBuilder();
        while(current != null){
            s.append(current.val);
            current = current.next;
        }
        return Integer.parseInt(s.toString(),2);
    }
}