/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author Masrawy
 */
public class savedData {
    private static String userName , Server , id_account , name_account;

    public static String getName_account() {
        return name_account;
    }

    public static void setName_account(String name_account) {
        savedData.name_account = name_account;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        savedData.userName = userName;
    }

    public static String getServer() {
        return Server;
    }

    public static void setServer(String Server) {
        savedData.Server = Server;
    }

    public static String getId_account() {
        return id_account;
    }

    public static void setId_account(String aId_account) {
        id_account = aId_account;
    }


    
    
}
