package BST;

import java.util.*;
import java.util.stream.Stream;

public class LevelOrderTraversal {
    Node head;

    LevelOrderTraversal(){
        head=null;
    }

    public List<List<Integer>> traversal(Node head){
        List<List<Integer>> output  = new LinkedList<>();

        if(head == null){
            return output ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();

            while (size>0){
                Node current = queue.poll();
                list.add(current.data);
                if(current.left!=null) {
                    queue.add(current.left);
                }
                if(current.right!=null) {
                    queue.add(current.right);
                }
                size--;
            }
            output.add(list);
        }
        return output;
    }

    public static void main(String[] args) {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.head = new Node(3);
        levelOrderTraversal.head.left = new Node(9);
        levelOrderTraversal.head.right = new Node(20);
        levelOrderTraversal.head.right.left = new Node(15);
        levelOrderTraversal.head.right.right = new Node(7);
        List list = levelOrderTraversal.traversal(levelOrderTraversal.head);
        list.forEach(h -> System.out.print(h + ", "));
    }

}
