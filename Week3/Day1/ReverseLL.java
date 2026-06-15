
class Solution {
    public ListNode reverseList(ListNode head){
       if(head == null){
        return head ;
       }
        ListNode prev = null;
        ListNode pre = head ;
        ListNode  next = pre.next ;
          while (pre != null){
       
              pre.next = prev ;
              prev =pre ;
              pre = next ;
               if(next != null){y
                   next = next.next;   
            }
          }
          return prev ;
    }
}
