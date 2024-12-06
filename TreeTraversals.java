/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author Kurt
 */
public class TreeTraversals {
    public static void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node);
            inorderTraversal(node.right);
        }
    }

    public static void preorderTraversal(Node node) {
        if (node != null) {
            System.out.println(node);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public static void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.println(node);
        }
    }
}
