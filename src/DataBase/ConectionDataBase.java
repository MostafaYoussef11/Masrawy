/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.javafx.iio.common.ImageTools;
import com.sun.javafx.tk.Toolkit;
import gold.account.Login;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosta
 */
public class ConectionDataBase {
    private static Connection con;
    private static Statement stmt;
    private static String server ;

  private static void SetConnection(){
      server = savedData.getServer();
      try{
          Class .forName("com.mysql.jdbc.Driver");
          switch(server){
              case "المحلي" :
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/masrawy?useUnicode=yes&characterEncoding=UTF-8", "mostafa","As@2800257");
                 break;
              case "41.38.1.120" :
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://41.38.1.120/masrawy?useUnicode=yes&characterEncoding=UTF-8", "mostafa","As@2800257");
                 break;
              default:
                 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/masrawy?useUnicode=yes&characterEncoding=UTF-8", "mostafa","As@2800257");
                 break;
          }
      }catch(ClassNotFoundException | SQLException ex){
          Tools.ErorBox(ex.getMessage());
          System.err.println(ex.getMessage());
      }
  
  }
    
  public static boolean CheckUesrName(String userName , String Password){
     try{
           boolean isTrue = false;
           SetConnection();
           stmt = (Statement) con.createStatement();
           String sql = "Select * from users where username='"+userName+"' and passwod='"+Password+"';";
           ResultSet rst = stmt.executeQuery(sql);
           if(rst.next()){
             isTrue = true;
           } 
           con.close();
           return isTrue;
       }catch(SQLException ex){
           System.err.println(ex.getMessage());
           return false;
       }
  
  }
      public static void fillAndCenterTable(String sql , JTable table , String[] coulmnName){
       try{
           SetConnection();
           stmt = (Statement) con.createStatement();
           ResultSet rst = stmt.executeQuery(sql);
           ResultSetMetaData rstmd = rst.getMetaData();
           Vector v = new Vector();
           int count = rstmd.getColumnCount();
           DefaultTableModel model = (DefaultTableModel) table.getModel();
           Tools.CenterTable(coulmnName, table);
           model.setRowCount(0);
           while(rst.next()){
               v = new Vector(count);
               for(int i =1 ; i<=count ; i++){
                   v.add(rst.getString(i));
               }
               model.addRow(v);
           }
           con.close();
       }catch(SQLException ex){
           Tools.ErorBox(ex.getMessage());
       }
   } 
      public static String AutoId(String tableName,String CoulmName){
       try{
           String Id = null;
           SetConnection();
           stmt = (Statement) con.createStatement();
           stmt.executeQuery("SELECT MAX("+CoulmName+")+1 AS lastId FROM "+tableName);
           ResultSet rst = stmt.getResultSet();
           while(rst.next()){
               Id = rst.getString("lastId");
           }
           con.close();
           if(Id == null || Id.equals("0")){
               return "1";
           }else{
               return Id;
           }
       }
       catch(SQLException ex){
           Tools.ErorBox(ex.getMessage());
           return null;
       }
   }
   // String sql_assets = "SELECT SUM(price_assets) FROM assets;";
   public static String getSum(String tableName , String CoulmName){
    try{
       String sum = null;
       SetConnection();
       stmt = (Statement) con.createStatement();
       stmt.executeQuery("SELECT SUM("+CoulmName+") AS sum FROM "+tableName+";");
       ResultSet rst = stmt.getResultSet();
       while(rst.next()){
           sum = rst.getString("sum");
       }
       con.close();
       if(sum == null || sum.equals("0")){
           return "0.00";
       }else{
           return sum;
       }
    }
   catch(SQLException ex){
       Tools.ErorBox(ex.getMessage());
       return null;
    } 
   
 }
     public static String getSumOnDay(String tableName , String CoulmName){
    try{
       String sum = null;
       SetConnection();
       stmt = (Statement) con.createStatement();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(new Date());
       stmt.executeQuery("SELECT SUM("+CoulmName+") AS sum FROM "+tableName+" WHERE date_"+tableName+" = '"+date+"' ; ");
       ResultSet rst = stmt.getResultSet();
       while(rst.next()){
           sum = rst.getString("sum");
       }
       con.close();
       if(sum == null || sum.equals("0")){
           return "0.00";
       }else{
           return sum;
       }
    }
   catch(SQLException ex){
       Tools.ErorBox(ex.getMessage());
       return null;
    } 
   
 }
   public static ImageIcon getImageImport(String id){
        //       imagebytes = rs.getBytes("images");
        //image=getToolkit().createImage(imageBytes);
        //Image img = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        //ImageIcon icon=new ImageIcon(img);
        //jLabel6.setIcon(icon);
         ImageIcon icon = null ;
        try{
            SetConnection();
            stmt = (Statement)con.createStatement();
            String sql = "Select image from imports where id_import="+id+" AND image IS NOT NULL;";
            stmt.executeQuery(sql);
            ResultSet rst = stmt.getResultSet();
            while (rst.next()) {
              Blob imageBlob = rst.getBlob("image");
              byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
              icon=new ImageIcon(imageBytes);
              Image image = getSizeImage(icon.getImage(), 220,180);
              icon = new ImageIcon(image);
           
            }
            con.close();
            return icon;
        }catch(SQLException ex){
            Tools.MasgBox(ex.getMessage());
            return icon;
        
        }
        
   
   } 
   //220 h = 180
   private static  Image getSizeImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }   
   
   public static boolean SaveImportTable(String id ,String date ,String wight , String caliber , String price , String amount , String id_wg ,String path){
       try{
           SetConnection();
           PreparedStatement pstm = (PreparedStatement) con.prepareStatement("INSERT INTO imports VALUES(?,?,?,?,?,?,?,?)");
           pstm.setInt(1, Integer.valueOf(id));
           pstm.setString(2, date);
           pstm.setDouble(3,Double.valueOf(wight));
           pstm.setInt(4, Integer.valueOf(caliber));
           pstm.setDouble(5,Double.valueOf(price));
           pstm.setDouble(6,Double.valueOf(amount));
           pstm.setInt(7, Integer.valueOf(id_wg));
           InputStream in = new FileInputStream(path);
           pstm.setBlob(8, in);
           pstm.execute();
           
           con.close();
           return true;
       }catch(SQLException ex){
           Tools.ErorBox(ex.getMessage());
           return false;
       } catch (FileNotFoundException ex) {
            Logger.getLogger(ConectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
   
   }
      
      
    public static boolean ExecuteAnyQuery(String sql){
       try{
         
           SetConnection();
           stmt = (Statement) con.createStatement();
           stmt.execute(sql);
           con.close();
           return true;
       }
       catch(SQLException ex){
           Tools.ErorBox(ex.getMessage());
           return false;
       }
       
   } 
   public static void fillCombo(String tableName , String coulmName , JComboBox combo){
       try{
           SetConnection();
           stmt = (Statement) con.createStatement();
           ResultSet rst;
           String sql = "SELECT "+coulmName+" FROM "+tableName+";";
           rst = stmt.executeQuery(sql);
           rst.last();
           int c = rst.getRow();
           rst.beforeFirst();
           String values[] = new String[c];
           int i = 0;
           while(rst.next()){
               values[i]=rst.getString(1);
               i++;
           }
           con.close();
           combo.setModel(new DefaultComboBoxModel(values));
       }catch(SQLException ex){
           Tools.ErorBox(ex.getMessage());
       
       }
   
   }
   
   public static String getIdFrmName(String tablename , String name){
       try{
           String id = "";
           SetConnection();
           stmt = (Statement) con.createStatement();
           String sql = "SELECT id_"+tablename+" AS id FROM "+tablename+" where name_"+tablename+" ='"+name+"';";
           ResultSet rst = stmt.executeQuery(sql);
           while(rst.next()){
               id = rst.getString("id");
           }
           con.close();
           return id;
       
       }catch(SQLException ex){
           return "";
       }
   
   }
    
}
