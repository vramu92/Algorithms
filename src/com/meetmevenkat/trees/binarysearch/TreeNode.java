package com.meetmevenkat.trees.binarysearch;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int nodeValue) {
        this.data = nodeValue;
    }

    public int getData() {
        return data;
    }

    public void setData(int node) {
        this.data = node;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }

    public void insertNode(int value) {
        if (value == data)
            return;
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }else{
                leftChild.insertNode(value);
            }
        }else{
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }else{
                rightChild.insertNode(value);
            }
        }

    }

    public void traverseInOrder(){
        if(leftChild != null ){
            leftChild.traverseInOrder();
        }
        System.out.print(data+", ");
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if(value == data ){
            return this;
        }
        if(value < data && leftChild != null){
            return leftChild.get(value);
        }else{
            if(rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        return leftChild.min();
    }

    public int max(){
        if(rightChild == null){
            return data;
        }
        return rightChild.max();
    }

}
