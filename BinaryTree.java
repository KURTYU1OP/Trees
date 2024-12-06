/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author Kurt
 */
public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

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
}

