package com.ENSAK.TPWeb.Metier;

import com.ENSAK.TPWeb.Persistance.DAOEtudiant;

import java.util.ArrayList;

public class TraitementEtudiant {

    static public ArrayList<Etudiant> getAll()
    {
        DAOEtudiant daoEtudiant = new DAOEtudiant();
        return daoEtudiant.getAll();
    }
}
