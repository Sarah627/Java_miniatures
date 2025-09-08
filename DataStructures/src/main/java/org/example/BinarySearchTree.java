package org.example;

public class BinarySearchTree {

    private class Node{
        int element;
        Node right = null;
        Node left = null;
        Node(int element) {
            this.element = element;
        }
    }

    Node root=null;

    public void insert(int element){
        root = insert(element, root);
    }

    //recursive helper method

    private Node insert(int element, Node node){
        if(node == null){
            return new Node(element);
        }
        if(element<=node.element){
            node.left = insert(element,node.left);
        }
        else if(element>node.element){
            node.right = insert(element,node.right);
        }

        return node;

    }



}
