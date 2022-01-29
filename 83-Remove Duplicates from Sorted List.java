// O(n) time and space both 
// will upload in O(1) space later

// Constraints:
// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode ans = new ListNode(-500,null);
        ListNode ansTemp = ans;
        
        ListNode temp = head;
        
        while(temp != null){
            if(ansTemp.val != temp.val){
                ListNode newNode = new ListNode(temp.val);
                ansTemp.next = newNode;
                ansTemp = ansTemp.next;
            }
            temp = temp.next;
        }
        
        ans = ans.next;
        
        return ans;
    }
