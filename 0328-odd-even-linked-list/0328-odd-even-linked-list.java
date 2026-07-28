class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    // public ListNode oddEvenList(ListNode head) {
    //     if (head == null || head.next == null)
    //         return head;

    //     ListNode dummy1 = new ListNode(-1);
    //     ListNode dummy2 = new ListNode(-1);
    //     ListNode t1 = dummy1;
    //     ListNode t2 = dummy2;
    //     ListNode curr = head;
    //     int pos = 1;

    //     while (curr != null) {

    //         if (pos % 2 != 0) {
    //             t1.next = curr;
    //             t1 = t1.next;
    //         } else {
    //             t2.next = curr;
    //             t2 = t2.next;
    //         }

    //         curr = curr.next;
    //         pos++;
    //     }

    //     t2.next = null;
    //     t1.next = dummy2.next;

    //     return dummy1.next;
    // }
}