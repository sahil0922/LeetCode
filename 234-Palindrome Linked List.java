//optimised approach will be uploaded later on using iteration

public static ListNode left = null;
    
    public boolean helper(ListNode node){
        if(node == null) return true;
        
        boolean rans = helper(node.next);
        
        if(rans == false) return false;
        
        if(node.val == left.val){
            left = left.next;
            return true;
        }
        
        return false;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        left = head;
        
        boolean ans = helper(head);
        
        left = null;
        
        return ans;
    }
