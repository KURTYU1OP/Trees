/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author Kurt
 */
public class Node {
    int itmno; // Item code
    String itmdesc; // Item description
    int qty; // Quantity
    double uprice; // Unit price
    double disc; // Discount
    Node left, right; // Left and right children

    public Node(int itmno, String itmdesc, int qty, double uprice, double disc) {
        this.itmno = itmno;
        this.itmdesc = itmdesc;
        this.qty = qty;
        this.uprice = uprice;
        this.disc = disc;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return String.format("[Item Code: %d, Description: %s, Qty: %d, Price: %.2f, Discount: %.2f%%]", itmno, itmdesc, qty, uprice, disc);
    }
}
