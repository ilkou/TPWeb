package com.ENSAK.TPWeb.Metier;

public class Etudiant {
    private String Cne;
    private String NomE;
    private String PrenomE;
    private String AddresseE;
    private int numero;

    public Etudiant() {
        Cne = new String();
        NomE = new String();
        PrenomE = new String();
        AddresseE = new String();
    }

    public String getCne() {
        return Cne;
    }

    public String getNomE() {
        return NomE;
    }

    public String getPrenomE() {
        return PrenomE;
    }

    public String getAddresseE() {
        return AddresseE;
    }

    public int getNumero() {
        return numero;
    }

    public Etudiant(String cne, String nomE, String prenomE, String addresseE, int numero) {
        this.Cne = cne;
        this.NomE = nomE;
        this.PrenomE = prenomE;
        this.AddresseE = addresseE;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return Cne + ";" + NomE + ";" + PrenomE + ";" + AddresseE + ";" + numero;
    }
}
