package com.example.demo.entity;

import java.util.ArrayList;

/**
 * @author Flora on 2021/2/4.
 */
public class Tree {
    private Node root;


    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        var current = root;
        while(true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = new Node(value);
                    return;
                }
                current = current.leftChild;
            }else{
                if(current.rightChild == null){
                    current.rightChild = new Node(value);
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current = root;

        while(current != null){
            if(value < current.value){
                current = current.leftChild;
            }else if(value > current.value){
                current = current.rightChild;
            }else{
                return true;
            }
        }
        return false;
    }

    /**
     * 前序遍历
     */
    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    /**
     * 中序遍历
     */
    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    /**
     * 后续遍历
     */
    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root == null){
            return -1;
        }
        if(root.leftChild == null && root.rightChild == null){
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int min(){
        return min(root);
    }

    private int min2(Node root){
        if(root == null){
            throw new IllegalStateException();
        }
        var current = root;
        var last = current;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    /**
     * 二叉树的最小值
     * @param root
     * @return
     */
    private int min(Node root){
        if (root.leftChild == null && root.rightChild == null){
            return root.value;
        }

        if (root.leftChild == null && root.rightChild != null){
            return Math.min(root.value, min(root.rightChild));
        }

        if (root.leftChild != null && root.rightChild == null){
            return Math.min(root.value, min(root.leftChild));
        }

        return Math.min(Math.min(root.value, min(root.leftChild)), min(root.rightChild));
    }

    /**
     * 递归判断两个树是否相同
     * @param other
     * @return
     */
    public boolean equals(Tree other){
        if(other == null){
            return false;
        }
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second){
        if(first == null && second == null){
            return true;
        }
        if(first != null && second != null){
            return first.value == second.value &&
                    equals(first.leftChild, second.leftChild) &&
                    equals(first.rightChild, second.rightChild);
        }
        return false;
    }

    /**
     * validating binary search tree
     * @return
     */
    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.value < min || root.value > max){
            return false;
        }
        return isBinarySearchTree(root.leftChild, min, root.value - 1) &&
                isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    /**
     * 获取第n层的节点
     * @param distance
     */
    public ArrayList<Integer> getNodesAtDistance(int distance){
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(distance == 0){
            list.add(root.value);
            return;
        }
        getNodesAtDistance(root.leftChild, distance -1, list);
        getNodesAtDistance(root.rightChild, distance -1, list);
    }

    public void traversePreOrder2(){
        traversePreOrder2(root);
    }

    private void traversePreOrder2(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder2(root.leftChild);
        traversePreOrder2(root.rightChild);
    }
}
