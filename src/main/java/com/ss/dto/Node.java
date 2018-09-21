package com.ss.dto;

public class Node {
    private String root;
    private Node rightNode;
    private Node leftNode;

    public Node getLeftNode() {
        return leftNode;
    }

    public Node setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
        return this;
    }

    public Node(){

    }

    public Node(String root) {
        this.root = root;
    }

    public String getRoot() {
        return root;
    }

    public Node setRoot(String root) {
        this.root = root;
        return this;
    }


    public Node getRightNode() {
        return rightNode;
    }

    public Node setRightNode(Node rightNode) {
        this.rightNode = rightNode;
        return this;
    }

}
