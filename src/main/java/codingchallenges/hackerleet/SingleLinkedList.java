package codingchallenges.hackerleet;

public class SingleLinkedList {
    //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //Output: 7 -> 0 -> 8
    //Explanation: 342 + 465 = 807.

    public static ListNode addTwsoNumbers(ListNode l1, ListNode l2) {
        ListNode previous = new ListNode(0);
        ListNode head = previous;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode current = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            current.val = sum % 10;
            carry = sum / 10;
            previous.next = current;
            previous = current;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;

    }

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q == null) ? 0 : q.val;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }


}
