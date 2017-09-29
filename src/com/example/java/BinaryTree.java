package com.example.java;

/**
 * Created by Christopher on 8/6/2017.
 */
public class BinaryTree extends Node {

    public static Node root;


    //create a BinaryTree node
    public BinaryTree (int data){
          setKey(data);
    }

    //add method to create a BinaryTree node chain
    public void add(Node parent, Node child, String orientation){
        if (orientation.equals("left")){
            parent.setLeft(child);
        } else {
            parent.setRight(child);
        }
    }

    //method getHeight will recursively invoke getHeight on each tree node branch and the
    //Math.max method will return the max value between the right or left node branches.
    static public int getHeight(Node root){
        if (root == null){
            return -1;  //Base case
        }
        return Math.max(getHeight(root.getLeft()) + 1, getHeight(root.getRight()) + 1);
    }

    /*
        This isBalanced will recursively invoke the getHeight method to get the max height
        between the left and right tree branch. Then the height difference will be compared
        to see if it is equal or not greater than 1. Given to be balance the heights of the
        two subtrees of any node never differ by more than one.
     */
    static public boolean isBalanced(Node root){
        if (root == null) return true;  //Base case

        int heightDiff = getHeight(root.getLeft()) - getHeight(root.getRight());

        if (Math.abs(heightDiff) > 1){
            return false;
        }else {
            return isBalanced(root.getLeft()) && isBalanced(root.getRight());
        }
    }



}
