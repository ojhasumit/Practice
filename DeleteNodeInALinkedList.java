package LinkedList;

public class DeleteNodeInALinkedList<T> {
    Node head;

    DeleteNodeInALinkedList(){
        head=null;
    }

    public void add(Object data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void print(Node head){
        Node current = head;
        while (current!=null){
            System.out.print(current.data);
            current = current.next;
        }
    }

    public void delete(int data){
        Node current = head;

        while ((Integer)current.next.data!=data && current!=null){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList<Integer> ll = new DeleteNodeInALinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print(ll.head);
        System.out.println("");
        ll.delete(3);
        ll.print(ll.head);
    }

}
