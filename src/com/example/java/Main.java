package com.example.java;

import static com.example.java.BinaryTree.getHeight;
import static com.example.java.BinaryTree.isBalanced;
import static com.example.java.Node.*;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 4.4. This program will create a BinaryTree
            and check if the tree is balanced. A balanced tree is defined to be a tree such that a
            the heights of the two subtrees of any node never differ by more than one.
         */
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        Node n6 = new Node(6);
        Node n7 = new Node(13);

        BinaryTree myTree = new BinaryTree(3);   //         3
                                                       //       /  \
        myTree.add(myTree, n1, "left");     //      1    4
        myTree.add(myTree, n2, "right");    //          / \
        myTree.add(n2,n3, "left");          //         2   5
        myTree.add(n2,n4,"right");          //            / \
        myTree.add(n4,n5,"right");          //               7
        myTree.add(n5,n6,"left");          //               / \
        myTree.add(n5,n7,"right");          //             6   13                                                          //            6   13

        //invoke the getHeight method
        int resultHeight = getHeight(myTree);
        System.out.println("The height of the tree is: " + resultHeight);

        //invoke the isBalanced method
        Boolean resultBalanced = isBalanced(myTree);
        System.out.println("Is the tree balanced: " + resultBalanced);

    }

}
