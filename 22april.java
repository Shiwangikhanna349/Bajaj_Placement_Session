//reverse linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}



//middle of the linked list
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}


//linked list cycle
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}