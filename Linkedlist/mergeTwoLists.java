class mergeTwoLists {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode preHead = new ListNode(0);
        ListNode last = preHead;
        
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                last.next = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                l1 = l1.next;
            }
            
            last = last.next;
        }
        
        if(l1 == null) {
            last.next = l2;
        } else {
            last.next = l1;
        }
        
        return preHead.next;
    }
    
    
    
    // using recursion

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
    
    
    
}
