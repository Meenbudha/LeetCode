

public class addFirst{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode = tail;
        size++;
    }

    public static void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void addMiddle(int idx, int data){
        Node newNode = new Node(data);
        if(size == 0){
            addFirst(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static int delFirst(int data){
        int val = head.data;
        if(size == 1){
            head = tail = null;
            size = 0;
            return val;
        }
        head = head.next;
        return val;
    }
    public 
    public static void main(String[] args) {
        
    }
}