package com.ss.dataprovider;

import com.ss.dto.Node;

import static java.lang.System.out;

public class TreeTraverser {

    //Returns the root node of the tree
    private Node createTreeStub(){
        Node rootNode_n0 = new Node("A");
        rootNode_n0.setLeftNode(new Node("B"));
        rootNode_n0.setRightNode(new Node("C"));
        Node n1_l = rootNode_n0.getLeftNode();
        n1_l.setLeftNode(new Node("D"));
        n1_l.setRightNode(new Node("E"));
        return rootNode_n0;
    }

    public static void main(String... args){
        TreeTraverser t = new TreeTraverser();
        Node rootNode = t.createTreeStub();
        out.print(rootNode.getRoot());
    }
}
