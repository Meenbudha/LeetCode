/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int maxDistance = 0;
        int minDistance = Integer.MAX_VALUE;

        int first = -1;
        int last = -1;

        int idx = 1;

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr.next != null){
            int prevVal = prev.val;
            int currVal = curr.val;
            int nextVal = curr.next.val;

            boolean isCritical = (prevVal > currVal && currVal < nextVal) || (prevVal < currVal && currVal > nextVal);

            if(isCritical){
                if(first == -1) first = idx;

                if(last != -1){
                    minDistance = Math.min(minDistance, idx - last);
                    maxDistance = Math.max(maxDistance, idx - first);
                }
                last = idx;
            }
            prev = curr;
            curr = curr.next;
            idx++;
        }

        if(minDistance == Integer.MAX_VALUE){
            return new int[]{-1, -1};
        }
        return new int[]{minDistance, maxDistance};
    }
}