package com.meetmevenkat.trees.binarysearch;

public class Tree {

    private TreeNode root;
    public void insert(int value){
        if(root == null) {
            root = new TreeNode(value);
        }
        else{
            root.insertNode(value);
        }
    }

    public void traverseInOrder(){
        if(root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root != null){
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max(){
        if(root != null){
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

    public void deleteNode(int value){
        if(root != null) {
            root = deleteNode(root, value);
        }
    }

    private TreeNode deleteNode(TreeNode treeNode, int value){
        if(treeNode.getData() == value){
            if(treeNode.getRightChild() != null){
                treeNode.setData(treeNode.getRightChild().min());
                return deleteNode(treeNode.getRightChild(), treeNode.getRightChild().min());
            }else if(treeNode.getLeftChild() != null){
                treeNode.setData(treeNode.getLeftChild().max());
                return deleteNode(treeNode.getLeftChild(), treeNode.getLeftChild().max());
            }else {
                treeNode = null;
            }
        }

        if(treeNode.getData() < value && treeNode.getLeftChild() != null){
            treeNode.setLeftChild(deleteNode(treeNode.getLeftChild(), value));
        }else{
            if(treeNode.getData() > value && treeNode.getRightChild() != null){
                treeNode.setRightChild(deleteNode(treeNode.getRightChild(), value));
            }
        }

        return treeNode;

    }
}
