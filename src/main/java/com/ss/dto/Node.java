package com.ss.dto;

public class Node {
    private String data;
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

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node setData(String data) {
        this.data = data;
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
