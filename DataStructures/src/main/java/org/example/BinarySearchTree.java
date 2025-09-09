package org.example;

public class BinarySearchTree {

    private static class Node{
        int element;
        Node right = null;
        Node left = null;
        Node(int element) {
            this.element = element;
        }
    }

    Node root=null;

    // public methods

    public void insert(int element){
        root = insert(element, root);
    }

    public int min(){
        return minimum(root);
    }

    public int max(){
        return maximum(root);
    }

    public int height(){
        return height(root);
    }

    //recursive helper methods

    private Node insert(int element, Node node){
        if(node == null){
            return new Node(element);
        }
        if(element<=node.element){
            node.left = insert(element,node.left);
        }
        else{
            node.right = insert(element,node.right);
        }
        return node;
    }

    private int minimum(Node node){

        if(node.left == null){
            return  node.element;
        }
        else{
            return minimum(node.left);
        }
        // iterative approach
        //Node temp =  node;
        //while(temp.left != null){
        //    temp = temp.left;
        //}
        //return temp.element;

    }
    private int maximum(Node node){

        if(node.right == null){
            return  node.element;
        }
        else{
            return maximum(node.right);
        }

    }

    private int height(Node node){
        if(node == null){
            return -1;
        }

        int rightTreeHeight = height(node.right);
        int leftTreeHeight = height(node.left);

        return Math.max(rightTreeHeight,leftTreeHeight) + 1;
    }



}
