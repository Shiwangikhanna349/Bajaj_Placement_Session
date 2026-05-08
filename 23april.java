//palindrome linked list
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null) {
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        while(prev!=null) {
            if(head.val!=prev.val) {
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}


//merge k sorted lists
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node:lists) {
            if(node!=null) {
                pq.offer(node);
            }
        }

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(!pq.isEmpty()) {
            ListNode node=pq.poll();
            curr.next=node;
            curr=curr.next;

            if(node.next!=null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }
}


//merge two sorted lists
class Solution {
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(list1!=null&&list2!=null) {
            if(list1.val<list2.val) {
                curr.next=list1;
                list1=list1.next;
            } else {
                curr.next=list2;
                list2=list2.next;
            } curr=curr.next;
        }
        if(list1!=null) {
            curr.next=list1;
        } else {
            curr.next=list2;
        }
        return dummy.next;
    }
}
