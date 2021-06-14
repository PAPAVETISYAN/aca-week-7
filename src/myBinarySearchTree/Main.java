package myBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree my = new MyBinarySearchTree();
        my.add(5);
        my.add(2);
        my.add(6);
        my.add(8);
        my.add(1);
        my.add(4);
        my.add(3);
        my.add(7);
        my.add(9);
        System.out.println(my.contains(8));
        System.out.println(my.contains(12));
        my.inOrder();
        System.out.println();
        my.preOrder();
        System.out.println();
        System.out.println(my.minValue());
        System.out.println(my.maxValue());
        my.postOrder();
        System.out.println();
        //my.levelOrder();
    }
}