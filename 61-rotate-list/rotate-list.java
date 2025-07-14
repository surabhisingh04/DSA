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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k<=0){
            return head ;
        }

        //find tail to connect 
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head; //basically connection jora 6 ka 1 seh 
        //rotation perform karna hai ;
        int rotation =k%length;
        int skip =length-rotation;
        ListNode newlast=head;
        //for loop chalana hai taaki 4 takk pahuchg paye 
        for(int i =1;i <skip;i++){
            newlast=newlast.next;
        }
        head=newlast.next; //basically 5
        newlast.next=null;
        return head ;

    }
}