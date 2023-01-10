class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> hm = new HashMap<>();
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        hm.put(0,dummy);
        while(curr != null){
            sum += curr.val;
            if(hm.containsKey(sum)){
                ListNode prevSumNode = hm.get(sum);
                ListNode toDelete = prevSumNode.next;
                int deleteSum = sum;
                while(toDelete != curr){
                    deleteSum += toDelete.val;
                    hm.remove(deleteSum);
                    toDelete = toDelete.next;
                }
                prevSumNode.next = curr.next;
            }
            else{
                hm.put(sum,curr);
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
