** Remove all elements from a linked list of integers that have value val.| LEET_CODE EASY **
 
/**
 * 
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
    public ListNode removeElements(ListNode head, int val) {  
        //Case 1: head is null
        if(head == null)
            return head;
        
        //Case 2: head is not null but head = val; adjust pointers.
        while(head != null && head.val == val){
            head = head.next;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        //Case 3: Normal Cases. 
        curr = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = prev.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
            
        }
        return head;
  }
} 
