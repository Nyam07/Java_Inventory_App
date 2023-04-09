/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ItemTableModel extends DefaultTableModel {

    private String[] columnNames;

    public ItemTableModel() {
        super(new Object[][]{}, new String[]{});
        this.columnNames = new String[]{"ItemID", "ItemName", "Category", "Quantity", "RetailPrice", "WholesalePrice", "Date Created", "Date Modified", "Status"};
        setColumnIdentifiers(columnNames);
    }

    @Override
    public int getColumnCount() {
        return columnNames.length + 1;
    }

    @Override
    public String getColumnName(int column) {
        if (column == getColumnCount() - 1) {
            return "Edit";
        } else {
            return columnNames[column];
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == getColumnCount() - 1) {
            return JPanel.class;
        } else {
            return super.getColumnClass(columnIndex);
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == getColumnCount() - 1;
    }

    @Override
    public Object getValueAt(int row, int column) {
        if (column == getColumnCount() - 1) {
            JButton button = new JButton("Edit");
            JPanel panel = new JPanel();
            panel.add(button);
            button.addActionListener(e -> {
                // open edit form for this row
                // you can get the values of the other columns using getValueAt() method
            });
            return panel;
        } else {
            return super.getValueAt(row, column);
        }
    }

}


