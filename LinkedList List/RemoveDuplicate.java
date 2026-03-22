import java.awt.HeadlessException;
import java.util.Collections;
import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicate {
    public static Node removeDuplicateUnsorted(Node head){

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while(current != null){
            if(seen.contains(current.data)){
                prev.next = current.next;
            } else{
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
    public static Node removeDuplicatesSorted(Node head){
        Node current = head;

        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
        return head;
    }

    public static void printlList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);

        System.out.println("Original list: ");
        printlList(head);
        head = removeDuplicatesSorted(head);
        System.out.println("List after removeing duplicates: ");
        printlList(head);
        head = removeDuplicateUnsorted(head);
        System.out.println("Linked List After Removing a Unsorted list: ");
        printlList(head);
        Collections.sort(head);
        printlList(head);
    }

    public static Node sortList(Node head){
        if(head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.nex = null;

        Node left = sortList(head);

        Node right = sortList(nextOfMiddle);
        return merge(left, right);
    }
}
