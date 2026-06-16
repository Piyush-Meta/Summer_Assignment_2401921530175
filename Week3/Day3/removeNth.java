class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0,head);
        if(head == null) return null;
        ListNode s = dummy;
        ListNode f = dummy;
        for(int i =0;i< n ;i++){
            s=s.next;
        }
     while(s.next!= null){
        s=s.next;
        f=f.next;
     }
     f.next =f.next.next;
     return dummy.next;
    }
}
