package com.ss.dataprovider;

import com.ss.dto.Node;

import java.util.*;

/*
 * Practised from - https://coderbyte.com/algorithm/tree-traversal-algorithms
 */
public class TreeTraverser {

    /*
    1) Return the root node value.
    2) Traverse the left subtree by recursively calling the pre-order function.
    3) Traverse the right subtree by recursively calling the pre-order function.
    */
    public List<String> preOrder(Node node, List<String> nodes) {
        nodes.add(node.getData());
        if (node != null) {
            if (node.getLeftNode() != null) {
                preOrder(node.getLeftNode(), nodes);
            }
            if (node.getRightNode() != null) {
                preOrder(node.getRightNode(), nodes);
            }
        }
        return nodes;
    }

    /*
    1) Traverse the left subtree by recursively calling the in-order function.
    2) Return the root node value.
    3) Traverse the right subtree by recursively calling the in-order function.
     */
    public List<String> inOrder(Node node, List<String> nodes){
        if(node != null) {
            if (node.getLeftNode() != null) {
                inOrder(node.getLeftNode(), nodes);
            }
            nodes.add(node.getData());
            if (node.getRightNode() != null) {
                inOrder(node.getRightNode(), nodes);
            }
        }
        return nodes;
    }

    /*
    1) Traverse the left subtree by recursively calling the post-order function.
    2) Traverse the right subtree by recursively calling the post-order function.
    3) Return the root node value.
    */
    public List<String> postOrder(Node node, List<String> nodes){
        if(node != null) {
            if (node.getLeftNode() != null) {
                postOrder(node.getLeftNode(), nodes);
            }
            if (node.getRightNode() != null) {
                postOrder(node.getRightNode(), nodes);
            }
        }
        nodes.add(node.getData());
        return nodes;
    }

    /*
    1) Add the root to a queue.
    2) Pop the last node from the queue, and return its value.
    3) Add all children of popped node to queue, and continue from step 2 until queue is empty.
    */
    public List<String> levelOrder(Node root, List<String> nodes){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() > 0) {
            Node currentNode = queue.remove();
            nodes.add(currentNode.getData());
            if (currentNode.getLeftNode() != null) {
                queue.add(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null) {
                queue.add(currentNode.getRightNode());
            }

        }
        return nodes;
    }

}

