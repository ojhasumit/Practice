package BST;

import java.util.Stack;

public class SortedArrayToBalancedBST {
    Node root;

    public Node convertToBST(int array[],int low, int high){
        Node node = root;

        if(low>high){
            return null;
        }
        int mid = (low+high)/2;

        node = new Node(array[mid]);

        node.left = convertToBST(array,low,mid-1);
        node.right = convertToBST(array,mid+1,high);

        return node;
    }

    public void inOrder(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data+", ");
            current = current.right;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        SortedArrayToBalancedBST tree = new SortedArrayToBalancedBST();

        tree.root = tree.convertToBST(array,0,array.length-1);
        tree.inOrder(tree.root);
    }
}
