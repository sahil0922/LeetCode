//O(N) time and space both

public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode temp = head;
        
        while(temp != null){
            if(set.contains(temp) == true){
                return true;
            }else{
                set.add(temp);
            }
            
            temp = temp.next;
        }
        
        return false;
    }
