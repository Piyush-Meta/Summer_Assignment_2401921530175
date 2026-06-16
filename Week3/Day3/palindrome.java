class Solution {
    public boolean isPalindrome(ListNode head)  {
        ListNode mid = midlist(head);
        ListNode headsec = rev(mid);
        ListNode rereversehead = headsec ;
        while (head != null && headsec != null) {
            if (head.val != headsec.val) {
                break;
            }
            head = head.next;
            headsec = headsec.next;
        }
        rev(rereversehead);
        if(head == null || headsec == null) {
            return true;
        }
        else{return false;
      }
    }
     public ListNode midlist(ListNode head) {
        ListNode s = head;
       ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode rev (ListNode head) {
    if (head == null){
        return head;
    }
            ListNode prev = null;
            ListNode pre = head;
        ListNode next = pre.next;
            while (pre != null) {
              pre.next = prev;
          prev = pre;
                pre = next;
                if (next != null) {
                    next = next.next;
                }
            }
           return prev;
        }
}
