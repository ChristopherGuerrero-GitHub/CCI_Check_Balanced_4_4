package com.example.java;

/**
 * Created by Christopher on 8/6/2017.
 */
public class Node {

    private int key;
    private Node right;
    private Node left;

    Node(){
//        this.key = 0;
    }

    Node(int key){
        this.key = key;
        right = null;
        left = null;

    }

    public void setKey(int key){
        this.key = key;
    }

    public int getKey(){
        return key;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public Node getRight(){
        return right;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public Node getLeft(){
        return left;
    }




}
