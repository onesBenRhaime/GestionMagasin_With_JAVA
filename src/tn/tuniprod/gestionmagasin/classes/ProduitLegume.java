
package tn.tuniprod.gestionmagasin.classes;

public class ProduitLegume extends ProduitAgricole{
    
    public ProduitLegume(float quantite, String saison, String type, int id, String lib, String marque, float prix) {
        super(quantite, saison, type, id, lib, marque, prix);
    }

    @Override
    public String toString() {
        return "ProduitLegume{" + super.toString()+'}';
    }

    
}
