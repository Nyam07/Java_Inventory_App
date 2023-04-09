/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Helper {
    
    public static void categoryData(JComboBox<String> categoryCombo){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select CategoryName, CategoryId from category");
            
            while(rs.next()){
                categoryCombo.addItem(rs.getString("CategoryName"));
            }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
           
            
    }
    
}
