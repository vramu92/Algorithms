package com.meetmevenkat.trees.binarysearch;

public class BinarySearchTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(35);
        tree.insert(5);
        tree.insert(34);
        tree.insert(11);
        tree.insert(45);
        tree.insert(61);
        tree.insert(22);
        tree.insert(31);
        tree.insert(44);
        tree.insert(52);
        tree.insert(2);
        tree.insert(7);
        tree.insert(24);


        tree.deleteNode(22);
        tree.traverseInOrder();

        /*System.out.println(" ");

        System.out.println(tree.get(45));
        System.out.println(tree.get(34));
        System.out.println(tree.get(98888));*/

        /*System.out.println(tree.min());
        System.out.println(tree.max());*/





    }
}
