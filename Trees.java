/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trees;

/**
 *
 * @author Kurt
 */
import java.util.Scanner;

public class Trees {

    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinarySearchTree searchTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Search Node");
            System.out.println("4. Display Inorder Traversal");
            System.out.println("5. Display Preorder Traversal");
            System.out.println("6. Display Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item code: ");
                    int itmno = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter item description: ");
                    String itmdesc = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter unit price: ");
                    double uprice = scanner.nextDouble();
                    System.out.print("Enter discount: ");
                    double disc = scanner.nextDouble();

                    // Insert in both trees
                    tree.insert(itmno, itmdesc, qty, uprice, disc);
                    searchTree.insert(itmno, itmdesc, qty, uprice, disc);
                    break;
                case 2:
                    System.out.print("Enter item code to delete: ");
                    int deleteCode = scanner.nextInt();
                    searchTree.delete(deleteCode); // Delete only from the search tree
                    break;
                case 3:
                    System.out.print("Enter item code to search: ");
                    int searchCode = scanner.nextInt();
                    Node result = searchTree.search(searchCode);
                    if (result != null) {
                        System.out.println("Node found: " + result);
                    } else {
                        System.out.println("Node not found.");
                    }
                    break;
                case 4:
                    System.out.println("Inorder Traversal:");
                    TreeTraversals.inorderTraversal(searchTree.getRoot());
                    break;
                case 5:
                    System.out.println("Preorder Traversal:");
                    TreeTraversals.preorderTraversal(searchTree.getRoot());
                    break;
                case 6:
                    System.out.println("Postorder Traversal:");
                    TreeTraversals.postorderTraversal(searchTree.getRoot());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}