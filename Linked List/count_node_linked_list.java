// Count Linked List Nodes
// https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }

//     Node(int data, Node next) {
//         this.data = data;
//         this.next = next;
//     }
// }

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int cnt = 0;
        Node temp = head;
        // Traverse the linked list and count nodes
        while (temp != null) {
            temp = temp.next;
            cnt++; // increment cnt for every node traversed
        }
        return cnt;
    }
}