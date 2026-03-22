
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
        size++;
        tail = newNode;
        
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void add(int idx, int data){
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
        size++;
    }

    public static int delFirst(){
        int val = head.data;
        if(size == 0){

            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }

    public static int delLast(){
        Node temp = head;
        if(size == 1){
            int val = temp.next.data;
            head = tail = null;
            size = 0;
            return val;
        }
        for(int i =0; i < size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public static int delSpec(int idx){
        Node temp = head;
        if(size == 1){
            int val = temp.next.data;
            head = tail = null;
            size = 0;
            return val;
        }
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;

    }
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        addFirst(2);
        addFirst(1);
        print();        
        // System.out.println(size);
        addLast(3);
        // System.out.println(size);
        addLast(4);
        addLast(6);
        
        // System.out.println(size);
        print();
        add(2, 5);
        print();
        System.out.println(size);
        delFirst();
        print();
        delLast();
        print();
        System.out.println(size);
        delSpec(0);
        print();
    }
}