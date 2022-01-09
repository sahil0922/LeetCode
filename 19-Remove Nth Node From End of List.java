public int size(ListNode node){
        ListNode temp = node;
        int i = 0;
        
        while(temp != null){
            i++;
            temp = temp.next;
        }
        
        return i;
        
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if((n == 1) && head.next == null) return null;
        
        if(size(head) == n){
            head = head.next;
            return head;
        }
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        for(int i = 1; i<=n; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
        
    }
