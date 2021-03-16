/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import gold.account.MainFrame;
import java.awt.Color;
import java.awt.Component;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

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
    
    public static void PrintRebort(String date ,InputStream stream){
        String imports = ConectionDataBase.getSumOnDay("imports", "amount_imports" , date);
        
        try {
           // InputStream stream =getClass().getResourceAsStream("/Rebort/dayReport.jrxml"); 
            JasperDesign jd = JRXmlLoader.load(stream); 
            String sql = "SELECT * FROM daily WHERE date_day='"+date+"';";
            JRDesignQuery designQuery = new JRDesignQuery();
            designQuery.setText(sql);
            jd.setQuery(designQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            HashMap para = new HashMap();
            para.put("date", date);
            para.put("sumImport", Double.valueOf(imports));
            para.put("server", savedData.getServer());
            Connection con = ConectionDataBase.getCon();
            JasperPrint jp = JasperFillManager.fillReport(jr, para, con);
            JasperViewer.viewReport(jp, false);
            
        } catch (NumberFormatException | JRException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
   public static void Printer(String sql ,InputStream stream , HashMap para){        
        try {
            JasperDesign jd = JRXmlLoader.load(stream); 
            JRDesignQuery designQuery = new JRDesignQuery();
            designQuery.setText(sql);
            jd.setQuery(designQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Connection con = ConectionDataBase.getCon();
            JasperPrint jp = JasperFillManager.fillReport(jr, para, con);
            JasperViewer.viewReport(jp, false);
            
        } catch (NumberFormatException | JRException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public static Color hex2Rgb(String colorStr) {
      return new Color(
            Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
            Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
            Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
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
