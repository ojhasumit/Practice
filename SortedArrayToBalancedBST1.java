package BST;

import java.util.Stack;

public class SortedArrayToBalancedBST1 {
    Node root;

    public Node convert(int array[], int low, int high){
        Node newNode = root;
        if(low>high){
            return newNode;
        }
        int mid = (low+high)/2;

        newNode = new Node(array[mid]);
        newNode.left = convert(array,low,mid-1);
        newNode.right = convert(array,mid+1,high);

        return newNode;
    }

    public void inOrder(Node root){
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current!=null || !stack.isEmpty()){

            while (current!=null){
                stack.add(current);
                current=current.left;
            }
            current = stack.pop();
            System.out.print(current.data+", ");

            current = current.right;
        }
    }

    public static void main(String[] args) {
        int array[] = {-10,-3,0,5,9};
        SortedArrayToBalancedBST1 binarytree = new SortedArrayToBalancedBST1();
        binarytree.root = binarytree.convert(array,0,array.length-1);
        binarytree.inOrder(binarytree.root);
    }
}
