package myBinarySearchTree;

public class MyBinarySearchTree {
    private Node root;


    public void add(Integer val){
        root = addRecursive(root, val);
    }
    private Node addRecursive(Node current, Integer val){
        if(current == null){
            return new Node(val);
        }
        if(current.value < val){
            current.right = addRecursive(current.right, val);
        }
        if (current.value > val){
            current.left = addRecursive(current.left, val);
        }
        return current;
    }

    public boolean contains(Integer val){
        return  containsRecursion(root, val) != null;
    }
    private Node containsRecursion(Node current, Integer val){
        if(current == null){
            return null;
        }
        if (current.value < val){
           return containsRecursion(current.right, val);
        }
        if (current.value > val){
            return containsRecursion(current.left, val);
        }
            return current;
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node current){
        if (current != null){
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node current){
        if (current != null){
            System.out.print(current.value + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    public int minValue(){
        Node node = root;
        while (node.left != null){
            node = node.left;
        }
        return node.value;
    }

    public int maxValue(){
        Node node = root;
        while (node.right != null){
            node = node.right;
        }
        return node.value;
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node current){
        if (current != null){
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.value + " ");
        }
    }

    /*public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node current){
       if (current == null){
            return;
        }
            levelOrder(current.left);
            levelOrder(current.right);
        System.out.print(current.value + " ");
    }*/
}