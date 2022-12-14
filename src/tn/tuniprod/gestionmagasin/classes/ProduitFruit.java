
package tn.tuniprod.gestionmagasin.classes;

public class ProduitFruit extends ProduitAgricole{
    
    public ProduitFruit(float quantite, String saison, String type, int id, String lib, String marque, float prix) throws PrixNegatifException {
        super(quantite, saison, type, id, lib, marque, prix);
    }

    @Override
    public String toString() {
        return "ProduitFruit{" + super.toString()+'}';
    }

    @Override
    public boolean estFrais(String saison) {
        return this.getSaison().equalsIgnoreCase(saison);
    }

  
    
}
