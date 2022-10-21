package tn.tuniprod.gestionmagasin.classes;

public class ProduitLegume extends ProduitAgricole {

    String[] tabMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre","janvier"};

    public ProduitLegume(float quantite, String saison, String type, int id, String lib, String marque, float prix) {
        super(quantite, saison, type, id, lib, marque, prix);
    }

    @Override
    public String toString() {
        return "ProduitLegume{" + super.toString() + '}';
    }

    @Override
    public boolean estFrais(String saison) {
        boolean ok = false;
        int index = 0;
        // String[12] = tabMois{};
        if (this.getSaison().equals(saison)) {
            ok = true;
        } else {
            for (int i = 0; i < 12; i++) {
                if (tabMois[i].equals(saison)) {
                    index = i;
                    break;
                }
            }
            ok=saison.equals(tabMois[index + 1]);
            return ok;
        }
        return ok;
    }

}
