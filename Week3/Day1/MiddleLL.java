
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        //ListNode f= head;
        int count = 0 ;
        while(s!= null){
            s= s.next;
            count ++;
        }
        s = head;
             int mid = count /2 ;
            for (int i = 0; i < mid ; i++) {
                s = s.next ;
            }  
        return s;
    }
}
