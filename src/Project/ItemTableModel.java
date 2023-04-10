/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import javax.swing.table.DefaultTableModel;


public class ItemTableModel extends DefaultTableModel {
    private String[] columnNames;

    public ItemTableModel(String[] columnNames) {
        super(new Object[][] {}, columnNames);
        this.columnNames = columnNames;
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


