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
    public ListNode middleNode(ListNode head) {
        HashMap<Integer,ListNode> map=new HashMap<Integer,ListNode>();
        int c=0;
        while(head!=null){
            c++;
            map.put(c,head);
            head=head.next;
        }
        
        if(c%2==0){
            c=(c/2)+1;
        }
        else{
            c=(c+1)/2;
        }
        
        return map.get(c);
    }
}