/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cart;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Sean M. Manding
 */
public class CartManager {
/*
  Manages the shopping cart in the Bulldogs Exchange Commerce system.
  This class handles cart operations, user details, and total price calculations.
 */
    // Stores the student's number
    private static String studentNumber;

    // Stores the contact number of the student
    private static String contactNumber;

    // Stores the date of purchase
    private static String date;

    // Table model for storing cart items with columns: Item, Gender, Size, Quantity, Price, and Total
    private static DefaultTableModel cartModel = new DefaultTableModel(
            new String[]{"Item", "Quantity", "Price", "Total"}, 0
    );

    /**
     * Returns the cart's table model.
     * @return DefaultTableModel representing the cart items.
     */
    public static DefaultTableModel getCartModel() {
        return cartModel;
    }

    /**
     * Notifies all table listeners that the cart data has changed.
     */
    public static void updateCart() {
        cartModel.fireTableDataChanged();
    }

    /**
     * Sets the preferred width of the first column in the cart table.
     * @param cartTable The JTable representing the cart.
     * @param width The desired width for the first column.
     */
    public static void widenFirstColumn(JTable cartTable, int width) {
        TableColumn column = cartTable.getColumnModel().getColumn(0); // Get the first column
        column.setPreferredWidth(width); // Set its preferred width

        cartTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN); // Ensures other columns adjust
    }

    /**
     * Calculates and returns the total price of all items in the cart.
     * @return The overall total price.
     */
    public static double getOverallTotal() {
        double overallTotal = 0;

        // Loop through all rows in the cart to sum up the total price
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            double itemTotal = Double.parseDouble(cartModel.getValueAt(i, 3).toString());
            overallTotal += itemTotal;
        }

        return overallTotal;
    }

    /**
     * Sets the student's number.
     * @param number The student number to be set.
     */
    public static void setStudentNumber(String number) {
        studentNumber = number;
    }

    /**
     * Retrieves the stored student number.
     * @return The student number.
     */
    public static String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Sets the contact number of the student.
     * @param contact The contact number to be set.
     */
    public static void setContactNumber(String contact) {
        contactNumber = contact;
    }

    /**
     * Retrieves the stored contact number.
     * @return The contact number.
     */
    public static String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the purchase date.
     * @param dates The date to be set.
     */
    public static void setDate(String dates) {
        date = dates;
    }

    /**
     * Retrieves the stored purchase date.
     * @return The purchase date.
     */
    public static String getDate() {
        return date;
    }
     public static void clearCart() {
        cartModel.setRowCount(0);
    }
}
