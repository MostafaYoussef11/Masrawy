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
    private static String userName , Server;

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


    
    
}
