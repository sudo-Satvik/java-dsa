package data_structure.linkedlist.singly_linkedlist.questions;

import java.util.List;

public class Palindrome {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedNode = reverse(slow.next);
        slow.next = reversedNode;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while (p2 != null){
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode after = null;
        ListNode curr = head;
        ListNode before = null;
        while(curr != null) {
            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
        return before;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println(isPalindrome(a));
    }
}
