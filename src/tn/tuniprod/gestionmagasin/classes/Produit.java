
package tn.tuniprod.gestionmagasin.classes;

import java.util.Date;
import java.util.Objects;

public class Produit {

    private int id;
    private String lib;
    private String marque;
    private float prix;
    private Date dateExpriration;

    public Produit() {
    }

    public Produit(int id, String lib, String marque, float prix) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int id, String lib, String marque) {
        this.id = id;
        this.lib = lib;
        this.marque = marque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        if (prix >= 0) {
            this.prix = prix;
        }
    }

    public void setDateExp(Date dateExpriration) {
        this.dateExpriration = dateExpriration;
    }

    public int getId() {
        return id;
    }

    public String getLib() {
        return lib;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public Date getDateExp() {
        return dateExpriration;
    }


    public boolean comparerB(Produit p1, Produit p2) {

        if (p1.id == p2.id && p1.prix == p2.prix && p1.lib == p2.lib) {
            return true;
        }

        return false;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.lib, other.lib)) {
            return false;
        }
        return true;
    }
  public void affecterDateExpiration(Date date){
        this.dateExpriration = date;
    }
       public void afficher(){
        System.out.println("------------------------");
        System.out.println("identifiant : "+this.id);
        System.out.println("libelle : "+this.lib);
        System.out.println("marque : "+this.marque);
        System.out.println("prix : "+this.prix);
        System.out.println("------------------------");
    }
    
    
    @Override
    public String toString() {
        String s = " ---------------------- \n";
        s += "identifiant : " + this.id + "\n";
        s += "libelle : " + this.lib + "\n";
        s += "marque : " + this.marque + "\n";
        s += "prix : " + this.prix + "\n";
        return s;
    }

    public void affecterPrix(float  price){
        if(price>=0){
            this.prix = price;
        }
        else{
            System.out.println("le prix est négatif !!");
        }
    }    
    
     public boolean comparer(Produit produit){
        return this.id==produit.id&&
                this.prix==produit.prix&&
                this.lib==produit.lib;
    }
}
