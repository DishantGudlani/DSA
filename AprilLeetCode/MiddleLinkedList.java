class Solution {
    
    ListNode result;
    
    public ListNode middleNode(ListNode head) {
        //find count of nodes
        
        int count = 0;
        
        ListNode[] array = new ListNode[100];
        
        int index = 0;
        
        ListNode node = head;
        
        while(node!=null)
        {
            array[index++] = node;
            node = node.next;
        }
        
        return array[index/2];
    }
}

