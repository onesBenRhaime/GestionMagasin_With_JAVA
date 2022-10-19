package tn.tuniprod.gestionmagasin.classes;

public class ProduitAgricole extends Produit {

    private float quantite;
    private String saison;
    private String type;

    public ProduitAgricole(float quantite, String saison, String type, int id, String lib, String marque, float prix) {
        super(id, lib, marque, prix);
        this.quantite = quantite;
        this.saison = saison;
        this.type = type;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
  

}
