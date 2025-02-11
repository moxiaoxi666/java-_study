public class TestDemo_10 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList =new MyLinkedList();
        myLinkedList.addFist(10);
        myLinkedList.addFist(11);
        myLinkedList.addFist(12);
        myLinkedList.addFist(13);
        myLinkedList.display();
        myLinkedList.addIndex(0,99);
        myLinkedList.addIndex(6,99);
        myLinkedList.display();
    }
}
