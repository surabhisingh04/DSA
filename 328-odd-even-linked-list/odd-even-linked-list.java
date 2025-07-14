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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head ;
        }
        ListNode currodd=head;
        ListNode curreven=head.next;
        ListNode odd= currodd;
        ListNode even = curreven ;

        while(curreven!=null&&curreven.next!=null){
            currodd.next= currodd.next.next;
            currodd=currodd.next;
            curreven.next= curreven.next.next;
            curreven=curreven.next;
        }
            currodd.next=even;
          return odd;
    }
}