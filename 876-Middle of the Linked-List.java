//here i have used concept of slow and fast

public ListNode middleNode(ListNode head) {
        
        // base case for 0 and 1 size linkedlist
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
