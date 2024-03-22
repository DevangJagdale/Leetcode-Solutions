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
        String s1="";
        
        while(head!=null){
            s1+=String.valueOf(head.val);
            head=head.next;
        }
        int i=0,j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j))return false;
            i++;
            j--;
        }
        
        return true;
    }
}