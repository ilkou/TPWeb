package com.ENSAK.TPWeb.Persistance;

import com.ENSAK.TPWeb.Metier.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;  

public class DAOEtudiant {

    Connection connection;

    public DAOEtudiant() {
        connection = ConnexionBD.connexion();
    }

    public ArrayList<Etudiant> getAll() {
        try
        {
            ArrayList<Etudiant> list = new ArrayList<Etudiant>();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from etudiant");
            while(rs.next())
                list.add(new Etudiant(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4), Integer.parseInt(rs.getString(5))));
            return list;
        }catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
