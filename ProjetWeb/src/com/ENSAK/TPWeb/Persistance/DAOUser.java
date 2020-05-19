package com.ENSAK.TPWeb.Persistance;

import java.sql.*;
import java.sql.*;  

public class DAOUser {
    Connection connection;

    public DAOUser() {
        connection = ConnexionBD.connexion();
    }
    public boolean isUser(String username, String password) {
        try
        {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT login, pass FROM user WHERE  login = '"+ username +"' AND pass = '"+ password +"");
            if(rs.next())
                return (true);
            else
                return (false);
        }catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
}