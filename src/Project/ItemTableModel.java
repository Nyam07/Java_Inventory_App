/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import javax.swing.table.DefaultTableModel;


public class ItemTableModel extends DefaultTableModel {
    private String[] columnNames = {"Item ID", "Name", "Description", "Category", "Price", "Quantity", "Supplier", "Date Added", "Last Updated"};

    public ItemTableModel() {
        super(new Object[][] {}, new String[] {});
        this.columnNames = new String[] {"ItemID", "ItemName", "Category", "Quantity", "RetailPrice", "WholesalePrice", "Date Created", "Date Modified", "Status"};
        setColumnIdentifiers(columnNames);
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

