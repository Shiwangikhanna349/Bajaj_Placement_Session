//ransom note
class Solution {
    public boolean canConstruct(String ransomNote,String magazine) {
        int[] count=new int[26];

        for(char ch:magazine.toCharArray()) {
            count[ch-'a']++;
        }

        for(char ch:ransomNote.toCharArray()) {
            if(count[ch-'a']==0) {
                return false;
            }

            count[ch-'a']--;
        }

        return true;
    }
}



//remove nth node from end of list
class Solution {
    public ListNode removeNthFromEnd(ListNode head,int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode fast=dummy;
        ListNode slow=dummy;

        for(int i=0;i<=n;i++) {
            fast=fast.next;
        }

        while(fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }
}