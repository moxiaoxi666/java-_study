class Node {
    public int data;
    public Node next;
    public Node prev;
    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    public Node tail;
    //头插
    public void addFist(int data) {
        Node newNode = new Node(data);
        if(this.head == null ) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }
    //打印双向列不爱
    public void display() {
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }
    public void addList(int data) {
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }
    public boolean contains(int key) {
            Node cur = this.head;
            while(cur != null) {
                if(cur.data==key) {
                    return true;
                }
                cur = cur.next;
            }
            return false;
    }
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
 public int remove(int key) {
     Node cur = this.head;
     while (cur != null) {
         int oldData = cur.data;
         if (cur.data == key) {
             if (cur == this.head) {
                 this.head = cur.next;
                 this.head.prev = null;
             } else {
                 cur.prev.next = cur.next;
                 if(cur.next !=null) {
                     cur.next.prev = cur.prev;
                 }else {
                     this.tail = cur.prev;
                 }

             }
             return oldData;
         }
         cur = cur.next;
     }
     return -1;
 }
}
