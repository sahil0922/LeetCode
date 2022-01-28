//time complexity O(n + m) 
//space complexity O(n + m)
// i'll later upload optimise approach later using constant space O(1)

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ans = new ListNode(-1,null);
        ListNode ansTemp = ans;
            
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ListNode x = new ListNode(temp1.val);
                ansTemp.next = x;
                temp1 = temp1.next;
            }else{
                ListNode x = new ListNode(temp2.val);
                ansTemp.next = x;
                temp2 = temp2.next;
            }
            
            ansTemp = ansTemp.next;
        }
        
        while(temp1 != null){
            ListNode x = new ListNode(temp1.val);
            ansTemp.next = x;
            ansTemp = ansTemp.next;
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            ListNode x = new ListNode(temp2.val);
            ansTemp.next = x;
            ansTemp = ansTemp.next;
            temp2 = temp2.next;
        }
        
        ans = ans.next;
        
        return ans;
        
    }
