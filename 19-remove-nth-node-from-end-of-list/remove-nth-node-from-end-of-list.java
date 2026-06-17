class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == n){
            return head.next;
        }
        temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(size - count == n && temp.next != null){
                temp.next = temp.next.next;  
                break;                       
            }
            temp = temp.next;
        }
        return head;  
    }
}