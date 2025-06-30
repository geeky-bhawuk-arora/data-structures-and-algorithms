// Linked List Cycle I
// https://leetcode.com/problems/linked-list-cycle/

class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}

// ---------------------------------------------------------------------------

// Linked List Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/description/

class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
    
}