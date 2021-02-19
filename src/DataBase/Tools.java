/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mosta
 */
public class Tools {
    public static void MasgBox(String masg){
        JOptionPane.showMessageDialog(null, masg);
    }
    public static void ErorBox(String masg){
        //JOptionPane.show
         JOptionPane.showMessageDialog(null,
                masg ,
                "Error Message",
                JOptionPane.ERROR_MESSAGE);
    }
    public static void CenterTable(String[] coulmnName , JTable table){
     DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        
        center.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        int count = coulmnName.length;
        for(int i = 0 ; i< count ; i++){
            table.getColumn(coulmnName[i]).setCellRenderer(center);
        }
//        JTableHeader header = table.getTableHeader();
//        header.setDefaultRenderer(center);
    }
    public static void SearchField(JTable table , JTextField txtsearch){
       TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        txtsearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = txtsearch.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
              String text = txtsearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    
    }
}
//class HeaderRender implements TableCellRenderer{
//    DefaultTableCellRenderer renderer;
//    public HeaderRender (JTable table){
//        renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
//        renderer.setHorizontalAlignment(JLabel.CENTER);
//    }
//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//    
//    }
//}
