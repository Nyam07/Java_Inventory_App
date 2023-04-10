/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Helper {

    public static void categoryData(JComboBox<String> categoryCombo) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select CategoryName, CategoryId from category");

            while (rs.next()) {
                categoryCombo.addItem(rs.getString("CategoryName"));
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static HashMap<String, Object> itemData(JComboBox<String> itemCombo) {

        HashMap<String, Object> itemTags = new HashMap<>();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select ItemName, ItemID from items");

            // Create a HashMap to store the item tags
            while (rs.next()) {
                String itemName = rs.getString("ItemName");
                String itemID = rs.getString("ItemID");

                itemCombo.addItem(itemName);
                // Store the tag in the HashMap
                itemTags.put(itemName, itemID);

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        
         return itemTags;

    }
}
