/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import DataBase.ConectionDataBase;

/**
 *
 * @author mosta
 */
public class exportEntity implements entityInterface{
    private String id_exports , date_exports , price_export , id_account ,note ,id_Suppliers , isFiltering , id_daily;
    
    @Override
    public boolean isAdd() {
        String sql = "INSERT INTO exports VALUES("+getNewId()+",'"+getDate_exports()+"',"+getId_account()+",'"+getNote()+"',"+getId_Suppliers()+",0,"+getId_daily();
        return ConectionDataBase.ExecuteAnyQuery(sql);
    }

    @Override
    public boolean isDelete() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sqlDel = "DELETE FROM exports WHERE id_exports="+getId_exports()+";";
        return ConectionDataBase.ExecuteAnyQuery(sqlDel);
        
    }

    @Override
    public boolean isUpdate() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isUpdateSupplier(String nameSupllier){
        setId_Suppliers(nameSupllier);
        String sql = "UPDATE exports SET id_Suppliers = " + getId_Suppliers() +" WHERE id_exports = "+getId_exports() + ";";
        return ConectionDataBase.ExecuteAnyQuery(sql);
    }

    @Override
    public String getNewId() {
        String id = ConectionDataBase.AutoId("exports", "id_exports");
        return id;
    }
    public String newId_daily(){
        return ConectionDataBase.AutoId("daily", "id_daily");
    
    }
    
    public String getId_exports() {
        return id_exports;
    }

    public void setId_exports(String id_exports) {
        this.id_exports = id_exports;
    }

    public String getDate_exports() {
        return date_exports;
    }

    public void setDate_exports(String date_exports) {
        this.date_exports = date_exports;
    }

    public String getPrice_export() {
        return price_export;
    }

    public void setPrice_export(String price_export) {
        this.price_export = price_export;
    }

    public String getId_account() {
        return id_account;
    }

    public void setId_account(String name_account) {
        String idAccount  = ConectionDataBase.getIdFrmName("account", name_account);
        this.id_account = idAccount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getId_Suppliers() {
        return id_Suppliers;
    }

    public void setId_Suppliers(String name_Suppliers) {
        String idSuppliers = ConectionDataBase.getIdFrmName("suppliers",name_Suppliers);
        this.id_Suppliers = idSuppliers;
    }

    public String getIsFiltering() {
        return isFiltering;
    }

    public void setIsFiltering(String isFiltering) {
        this.isFiltering = isFiltering;
    }

    public String getId_daily() {
        return id_daily;
    }

    public void setId_daily(String id_daily) {
        this.id_daily = id_daily;
    }
 
    
    
    
    
    
    
    
    
    

    
    
    
    
}
