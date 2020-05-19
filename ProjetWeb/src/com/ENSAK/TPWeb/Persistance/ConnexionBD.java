package com.ENSAK.TPWeb.Persistance;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ConnexionBD {
    private static Connection con;
    static {
        String URL = new String("jdbc:mysql://127.0.0.1:3306/UFR");
        String Login = new String("root");
        String Password = new String("pwdpwd");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, Login, Password);
        } catch (Exception e) { System.out.println(e);}
    }
    public static Connection connexion() {
        return con;
    }
}
