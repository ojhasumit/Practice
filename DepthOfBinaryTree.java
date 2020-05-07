package BST;

public class DepthOfBinaryTree {

    public int depth(Node root){
        if (root==null){
            return 0;
        }
        int lHeight = depth(root.left);
        int rHeight = depth(root.right);

        if(lHeight>rHeight){
           return lHeight+1;
        }else {
           return rHeight+1;
        }
    }

    public static void main(String[] args) {
        BT binaryTreeDepth = new BT();
        binaryTreeDepth.add(7);
        binaryTreeDepth.add(10);
        binaryTreeDepth.add(9);
        binaryTreeDepth.add(1);
        binaryTreeDepth.add(5);
        binaryTreeDepth.add(4);
        binaryTreeDepth.add(3);
        DepthOfBinaryTree depthOfBinary = new DepthOfBinaryTree();
        System.out.println(depthOfBinary.depth(binaryTreeDepth.root));
        }

}
