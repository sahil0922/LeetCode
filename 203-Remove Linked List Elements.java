//Iterative approach with O(N) time and O(1) space 
// check below for recursion approach

public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        
        if(head.next == null){
            if(head.val == val){
                head = head.next;
            }
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while(curr != null){
            if(curr.val == val){
                ListNode temp = curr.next;
                prev.next = temp;
            }else{
                 prev = curr;
            }
            curr = curr.next;
        }
        
        if(head.val == val){
            head = head.next;
        }
        return head;
    }

// Recursive approach using O(N) time and O(N) space of stack
public void remove(ListNode head, int val){
        if(head.next == null) return;
        
        remove(head.next,val);
        
        if(head.next.val == val){
            head.next = head.next.next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
         if(head == null) return head;
        
         remove(head, val);
         
        if(head.val == val){
            head = head.next;
        }
        
        return head;
    }
