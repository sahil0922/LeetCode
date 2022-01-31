//time complexity : O(n + m)
//space complexity : O(n + m) as per demand in question else O(1)

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null) return null;
        
        ListNode ans = new ListNode(-1,null);
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ansTemp = ans;
        
        int carry = 0;
        
        while(temp1 != null && temp2 != null){
            int sum = temp1.val + temp2.val + carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            ListNode x = new ListNode(digit,null);
            ansTemp.next = x;
            ansTemp = ansTemp.next;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        if(temp1 != null){
            while(temp1 != null){
                int sum = temp1.val + carry;
                carry = sum / 10;
                int digit = sum % 10;

                ListNode x = new ListNode(digit, null);
                ansTemp.next = x;
                ansTemp = ansTemp.next;

                temp1 = temp1.next;
            }
            
        }else if(temp2 != null){
            while(temp2 != null){
                int sum = temp2.val + carry;
                carry = sum / 10;
                int digit = sum % 10;

                ListNode x = new ListNode(digit, null);
                ansTemp.next = x;
                ansTemp = ansTemp.next;

                temp2 = temp2.next;
            }
            
        }
        
        if(carry > 0){
            ListNode x = new ListNode(carry, null);
            ansTemp.next = x;
            ansTemp = ansTemp.next;
        }
        
        ans = ans.next;
        
        return ans;
    }
