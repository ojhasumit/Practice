package BST;

import java.util.Stack;

public class BT {
Node root;

    public void add(int key){
        Node newNode = new Node(key);

        if(root==null){
            root=newNode;
        }
        else {
            Node current = root;
            while (current!=null){
                if(current.data>key){
                    if(current.left==null){
                        current.left = newNode;
                        break;
                    }
                    current=current.left;
                }else if(current.data<key){
                    if(current.right==null){
                        current.right=newNode;
                        break;
                    }
                    current = current.right;
                }else {
                    System.out.println("Duplicate data is not allowed in tree");
                }
            }
        }
    }

    public void inOrder(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data+", ");
            current = current.right;
        }
    }

    public void preOrder(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        stack.push(current);

        while (!stack.isEmpty()){
            current=stack.pop();
            System.out.print(current.data+", ");
            if(current.right!=null){
                stack.push(current.right);
            }
            if(current.left!=null){
                stack.push(current.left);
            }
        }
    }

    public void postOrder(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while (true){
            while (current!=null){
                stack.add(current);
                stack.add(current);
                current = current.left;
            }
            if(stack.isEmpty()){
                return;
            }
            current = stack.pop();

            if(!stack.isEmpty() && current == stack.peek()){
                current = current.right;;
            }else {
                System.out.print(current.data+", ");
                current = null;
            }
        }
    }

    public Node minValue(Node root){
        Node current = root;

        while (current.left!=null){
            current=current.left;
        }
        return current;
    }

    public Node deleteNode(int key, Node root){
        if(root==null){
            return null;
        }
        if(key<root.data){
            root.left = deleteNode(key,root.left);
        }else if(key>root.data) {
            root.right = deleteNode(key,root.right);
        }else {
            if(root.left==null && root.right==null){
                Node temp = null;
                temp = root.left==null?root.right:root.left;
                return temp;
            }else {
                Node successor = minValue(root.right);
                root.data = successor.data;
                root.right = deleteNode(successor.data,root.right);
            }
        }
        return root;
    }

    public void delete(int key){
        root = deleteNode(key,root);
    }

    public static void main(String[] args) {
        BT binaryTree = new BT();
        binaryTree.add(50);
        binaryTree.add(30);
        binaryTree.add(20);
        binaryTree.add(40);
        binaryTree.add(70);
        binaryTree.add(60);
        binaryTree.add(80);
        System.out.print("In Order: ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        System.out.print("Pre Order: ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.print("Post Order: ");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        System.out.println("==========================================");
        System.out.println("==================Deletion================");
        binaryTree.delete(20);
        binaryTree.delete(40);
        binaryTree.delete(50);
        binaryTree.inOrder(binaryTree.root);
    }

    }


