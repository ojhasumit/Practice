package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList<T> {
    Node head;

    PalindromeLinkedList(){
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

    public boolean isPalindrome(Node head){
        Stack<String> stack = new Stack<>();
        Node current = head;

        while (current!=null){
            stack.add(current.data.toString());
            current = current.next;
        }

        Node tempHead = head;

        while (tempHead!=null){
            if(!tempHead.data.equals(stack.pop())){
                return false;
            }
            tempHead = tempHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList<String> ll = new PalindromeLinkedList();
        ll.add("R");
        ll.add("A");
        ll.add("D");
        ll.add("A");
        ll.add("R");
        ll.print(ll.head);
        System.out.println("");
        System.out.println(ll.isPalindrome(ll.head));
    }
}
