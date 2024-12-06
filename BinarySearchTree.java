/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author Kurt
 */
public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    // Insert method (Standard binary search tree insertion)
    public void insert(int itmno, String itmdesc, int qty, double uprice, double disc) {
        root = insertHelper(root, new Node(itmno, itmdesc, qty, uprice, disc));
    }

    private Node insertHelper(Node node, Node newNode) {
        if (node == null) {
            return newNode;
        }

        if (newNode.itmno < node.itmno) {
            node.left = insertHelper(node.left, newNode);
        } else if (newNode.itmno > node.itmno) {
            node.right = insertHelper(node.right, newNode);
        }

        return node;
    }

    // Search method (Standard binary search)
    public Node search(int itmno) {
        return searchHelper(root, itmno);
    }

    private Node searchHelper(Node node, int itmno) {
        if (node == null || node.itmno == itmno) {
            return node;
        }

        if (itmno < node.itmno) {
            return searchHelper(node.left, itmno);
        }

        return searchHelper(node.right, itmno);
    }

    // Delete method (using successor for nodes with two children)
    public void delete(int itmno) {
        root = deleteHelper(root, itmno);
    }

    private Node deleteHelper(Node node, int itmno) {
        if (node == null) {
            return null; // Node not found
        }

        if (itmno < node.itmno) {
            node.left = deleteHelper(node.left, itmno);
        } else if (itmno > node.itmno) {
            node.right = deleteHelper(node.right, itmno);
        } else {
            // Node to be deleted found
            if (node.left == null && node.right == null) {
                return null; // No children
            } else if (node.left == null) {
                return node.right; // Only right child
            } else if (node.right == null) {
                return node.left; // Only left child
            } else {
                // Two children: Replace with successor
                Node successor = getSuccessor(node);
                node.itmno = successor.itmno;
                node.itmdesc = successor.itmdesc;
                node.qty = successor.qty;
                node.uprice = successor.uprice;
                node.disc = successor.disc;
                node.right = deleteHelper(node.right, successor.itmno);
            }
        }

        return node;
    }

    // Successor method (Inorder successor)
    private Node getSuccessor(Node node) {
        Node successor = node.right;
        while (successor != null && successor.left != null) {
            successor = successor.left;
        }
        return successor;
    }

    // Predecessor method (Inorder predecessor)
    private Node getPredecessor(Node node) {
        Node predecessor = node.left;
        while (predecessor != null && predecessor.right != null) {
            predecessor = predecessor.right;
        }
        return predecessor;
    }
}
