package com.ss.dataprovider;

import com.ss.dto.Node;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by SushmithaShamanth on 9/21/18.
 */
public class TreeTraverserTest {

    private Node smallTreeStubWithThreeLevels(){
        Node rootNode_n0 = new Node("A");
        rootNode_n0.setLeftNode(new Node("B"));
        rootNode_n0.setRightNode(new Node("C"));
        Node n1_l = rootNode_n0.getLeftNode();
        n1_l.setLeftNode(new Node("D"));
        n1_l.setRightNode(new Node("E"));
        return rootNode_n0;
    }

    private Node complexTreeStubWithFiveLevels(){
        Node rootNode_n0 = new Node("A");
        rootNode_n0.setLeftNode(new Node("B"));
        rootNode_n0.setRightNode(new Node("C"));
        Node n1_l = rootNode_n0.getLeftNode();
        n1_l.setLeftNode(new Node("D"));
        n1_l.setRightNode(new Node("E"));
        Node n2_r = n1_l.getRightNode();
        n2_r.setLeftNode(new Node("F"));
        n2_r.setRightNode(new Node("G"));
        Node n3_r = n2_r.getRightNode();
        n3_r.setRightNode(new Node("H"));
        return rootNode_n0;
    }

    @Test
    public void testPreOrderForSimpleTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.preOrder(smallTreeStubWithThreeLevels(), nodes);
        assertEquals(nodes.toString(), "[A, B, D, E, C]");
    }

    @Test
    public void testPreOrderForComplexTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.preOrder(complexTreeStubWithFiveLevels(), nodes);
        assertEquals(nodes.toString(), "[A, B, D, E, F, G, H, C]");
    }

    @Test
    public void testInOrderForSimpleTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.inOrder(smallTreeStubWithThreeLevels(), nodes);
        assertEquals(nodes.toString(), "[D, B, E, A, C]");
    }

    @Test
    public void testInOrderForComplexTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.inOrder(complexTreeStubWithFiveLevels(), nodes);
        assertEquals(nodes.toString(), "[D, B, F, E, G, H, A, C]");
    }

    @Test
    public void testPostOrderForSimpleTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.postOrder(smallTreeStubWithThreeLevels(), nodes);
        assertEquals(nodes.toString(), "[D, E, B, C, A]");
    }

    @Test
    public void testPostOrderForComplexTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.postOrder(complexTreeStubWithFiveLevels(), nodes);
        assertEquals(nodes.toString(), "[D, F, H, G, E, B, C, A]");
    }

    @Test
    public void testLevelOrderForSimpleTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.levelOrder(smallTreeStubWithThreeLevels(), nodes);
        assertEquals(nodes.toString(), "[A, B, C, D, E]");
    }

    @Test
    public void testLevelOrderForComplexTree() throws Exception {
        TreeTraverser t = new TreeTraverser();
        List<String> nodes = new ArrayList<>();
        nodes = t.levelOrder(complexTreeStubWithFiveLevels(), nodes);
        assertEquals(nodes.toString(), "[A, B, C, D, E, F, G, H]");
    }
}