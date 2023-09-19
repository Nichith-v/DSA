class RemoveDuplicatesfromList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(head == null){
            return head;
        }

        while(temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
}