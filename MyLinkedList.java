class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head; //保存单链表的头节点
    //头插
    public void addFist(int data) {
        //创造一个新节点
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        else {
            node.next = this.head;
            head = node;
        }
    }
    //打印单链表
    public void display() {
        if(this.head.next == null) {
            return;
        }
        else {
            Node cur = this.head;
            while(cur!=null) {
                System.out.print(cur.data+ " ");
                cur=cur.next;
            }
            System.out.println();
        }
    }
    //尾插
    public void endAdd(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }
        else {
            Node cur = this.head;
            while(cur.next!=null) {
                cur = cur.next;
            }
            cur.next =node;
        }
    }
//查找是否包含关键字key是否在单链表中
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        Node cur =this.head;
        while(cur!=null) {
            if(cur.data == key) {
                return true;
            }
            else {
                cur = cur.next;
            }
        }
        return false;
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur =this.head;
        while(cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //在任意位置之前插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index == 0) {
            this.addFist(data);
        }
        if(index == this.size()) {
            this.endAdd(data);
        }
        else {
            Node node =new Node(data);
            Node cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }
    private Node searchIndex(int index) {
         //1.对index进行合法检查
        if(index < 0 || index>this.size()) {
            throw new RuntimeException("index位置不合法");
        }
        Node cur =this.head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //删除给出关键字第一次key节点
    public void remove(int key) {
        //处理头节点
        if(this.head==null) {
            return ;
        }
        if(this.head.data == key && this.head.next == null ) {
            this.head = null;
        }
        Node prev =this.head;
        Node cur = prev.next;
        while(cur.data != key || cur != null) {
            cur = cur.next;
            prev =prev.next;
        }
        if(cur != null) {
            prev.next =cur.next;
        }
    }
    public void clear() {
        this.head = null;
    }
}
