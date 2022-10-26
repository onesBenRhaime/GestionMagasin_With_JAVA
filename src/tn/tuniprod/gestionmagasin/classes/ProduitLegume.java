package tn.tuniprod.gestionmagasin.classes;

public class ProduitLegume extends ProduitAgricole {
  
    
    public ProduitLegume(float quantite, String saison, String type, int id, String lib, String marque, float prix) throws PrixNegatifException {
        super(quantite, saison, type, id, lib, marque, prix);
    }

    
    @Override
    public String toString() {
        return "ProduitLegume{" + super.toString() + '}';
    }

    @Override
    public boolean estFrais(String saison) {
         //declaration , création est & ajouter a un tabMois 
    String[] tabMois = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre","janvier"};
        boolean ok = false;
        int index = 0;
       
        if (this.getSaison().equals(saison)) {
            ok = true;
        } else {
            for (int i = 0; i < 12; i++) {
                if (tabMois[i].equalsIgnoreCase(saison)) {
                    index = i;
                    break;
                }
            }
            ok=this.getSaison().equalsIgnoreCase(tabMois[index - 1]);
            return ok;
        }
        return ok;
    }
}
