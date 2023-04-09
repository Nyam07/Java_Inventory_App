
import Project.ConnectionProvider;
import Project.Helper;
import Project.ItemTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PC
 */
public class HomePage2 extends javax.swing.JFrame {

    /**
     * Creates new form HomePage2
     */
    //Method to show table details based on the query
    public void showTable(String query) {

        //display details in the table
        ItemTableModel dtm = new ItemTableModel();
        jTable1.setModel(dtm);

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String itemId = rs.getString("ItemId");
                String itemName = rs.getString("ItemName");
                String category = rs.getString("CategoryName");
                int quantity = rs.getInt("Quantity");
                double retailPrice = rs.getDouble("RetailPrice");
                double wholesalePrice = rs.getDouble("WholesalePrice");
                String dateCreated = rs.getString("DateCreated");
                String dateModified = rs.getString("DateModified");
                String status = rs.getString("Status");
                Object[] row = {itemId, itemName, category, quantity, retailPrice, wholesalePrice, dateCreated, dateModified, status};
                dtm.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public HomePage2() {
        initComponents();

        Helper.categoryData(homeCategorySelector);

        showTable("SELECT items.ItemId, items.ItemName, category.CategoryName, items.Quantity, items.RetailPrice, items.WholesalePrice, items.DateCreated, items.DateModified, items.Status FROM items INNER JOIN category ON items.Category = category.CategoryId");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newItemBtn_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        homeCategorySelector = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        homeCloseBtn_ = new javax.swing.JButton();
        logout_btn_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchBtn_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newItemBtn_.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        newItemBtn_.setText("Add New Item");
        newItemBtn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemBtn_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Duka Kuu Inventory System");

        categoryLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        categoryLabel.setText("Category");

        homeCategorySelector.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        homeCategorySelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        homeCategorySelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                homeCategorySelectorItemStateChanged(evt);
            }
        });
        homeCategorySelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeCategorySelectorActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        homeCloseBtn_.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        homeCloseBtn_.setText("Close");
        homeCloseBtn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeCloseBtn_ActionPerformed(evt);
            }
        });

        logout_btn_.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        logout_btn_.setText("Logout");
        logout_btn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn_ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        searchBtn_.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        searchBtn_.setText("Search");
        searchBtn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(newItemBtn_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(categoryLabel)
                        .addGap(124, 124, 124)
                        .addComponent(homeCategorySelector, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(searchBtn_)
                        .addGap(94, 94, 94)
                        .addComponent(homeCloseBtn_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(logout_btn_))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newItemBtn_)
                    .addComponent(categoryLabel)
                    .addComponent(homeCategorySelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeCloseBtn_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn_))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newItemBtn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemBtn_ActionPerformed
        setVisible(false);
        new Newitem().setVisible(true);
    }//GEN-LAST:event_newItemBtn_ActionPerformed

    private void homeCategorySelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeCategorySelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeCategorySelectorActionPerformed

    private void homeCloseBtn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeCloseBtn_ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_homeCloseBtn_ActionPerformed

    private void logout_btn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn_ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            setVisible(false);
            new Login_form().setVisible(true);
        }
    }//GEN-LAST:event_logout_btn_ActionPerformed

    private void homeCategorySelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_homeCategorySelectorItemStateChanged
        int selected_item = homeCategorySelector.getSelectedIndex();
        String query;

        if (selected_item == 0) {
            query = "SELECT items.ItemId, items.ItemName, category.CategoryName, items.Quantity, items.RetailPrice, items.WholesalePrice, items.DateCreated, items.DateModified, items.Status "
                    + "FROM items INNER JOIN category ON items.Category = category.CategoryId";
        } else {

            query = "SELECT items.ItemId, items.ItemName, category.CategoryName, items.Quantity, items.RetailPrice, items.WholesalePrice, items.DateCreated, items.DateModified, items.Status "
                    + "FROM items INNER JOIN category ON items.Category = category.CategoryId "
                    + "WHERE category.CategoryId = " + selected_item;
        }
        showTable(query);


    }//GEN-LAST:event_homeCategorySelectorItemStateChanged

    private void searchBtn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn_ActionPerformed
        String search_item = searchField.getText();
        
        String query = "SELECT items.ItemId, items.ItemName, category.CategoryName, items.Quantity, items.RetailPrice, items.WholesalePrice, items.DateCreated, items.DateModified, items.Status "
                + "FROM items INNER JOIN category ON items.Category = category.CategoryId "
                + "WHERE items.ItemName LIKE '%" + search_item + "%'";
        
        showTable(query);
        
    }//GEN-LAST:event_searchBtn_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> homeCategorySelector;
    private javax.swing.JButton homeCloseBtn_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_btn_;
    private javax.swing.JButton newItemBtn_;
    private javax.swing.JButton searchBtn_;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
