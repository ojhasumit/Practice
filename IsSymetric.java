package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsSymetric {

    public boolean symetric(Node root){

        if(root == null){
            return true;
        }else {
            Stack<Node> stack = new Stack<>();

        }

        return true;
}

    public static void main(String[] args) {
        BT binarySymetric = new BT();
        binarySymetric.root = new Node(1);
        binarySymetric.root.left = new Node(2);
        binarySymetric.root.right = new Node(2);
        binarySymetric.root.left.left = new Node(3);
        binarySymetric.root.left.right = new Node(4);
        binarySymetric.root.right.left = new Node(4);
        binarySymetric.root.right.right = new Node(3);
    }
}
