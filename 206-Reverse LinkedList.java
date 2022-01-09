public ListNode reverseList(ListNode head) {
        
        // for 0 and 1 size Nod
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null, curr = head;

        while(curr != null){
            ListNode forw = curr.next;

            curr.next = prev;
            prev = curr;

            curr = forw;

        }

        return prev;
    }
