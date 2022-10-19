package tn.tuniprod.gestionmagasin.classes;

import java.util.Arrays;

public class Magasin extends Produit {

    private int identifiant;
    private String adresse;
    private int capacite;
    int nbrEmploye;
    String nom;

    //declaration d'un tab
    private Produit[] produits = new Produit[50];
    // 2: declaration  private Produit produits [];
    Employe[] employes = new Employe[20];

    public Magasin() {
    }

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new Produit[50];
        capacite = 0;
    }

    public Magasin(int identifiant, String nom, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new Produit[50];
        this.nom = nom;
    }

    @Override
    public String toString() {
        String s = "";
        s += "identifiant : " + this.identifiant + " \n";
        s += "adresse : " + this.adresse + " \n";
        s += "capacite : " + this.capacite + " \n";

        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }

        return s + prods;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setTabProduit(Produit[] tabProduit) {
        this.produits = tabProduit;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public Produit[] getTabProduit() {
        return produits;
    }

    //Une méthode  permet d'ajouter un produit dans un magasin
    public void ajouterProduit(Produit produit) {
        if (this.chercher(produit)) {
            System.out.println("Produit existant");
        } else {
            this.produits[capacite] = produit;
            this.capacite++;
        }
    }

    public void ajouterEmploye(Employe employe) {
        this.employes[nbrEmploye] = employe;
        this.nbrEmploye++;
    }

    public int getIndexOfProduit(Produit produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return i;
            }
        }
        return -1;
    }

    public void supprimerProduit(Produit produit) {
        int indexProduit = this.getIndexOfProduit(produit);
        if (indexProduit == -1) {
            System.out.println("impossible de supprimer un produit qui n'existe pas dans le magasin");
        } else {
            for (int i = indexProduit; i < capacite; i++) {
                this.produits[i] = this.produits[i + 1];
                this.produits[capacite] = null;
                this.capacite--;
            }
        }
    }
    //une methode permet de afficher le nombre des produits d'une magasin

    public int getTotalProduits() {
        return this.capacite;
    }

    //Une méthode  permet de chercher un produit dans un magasin
    public boolean chercher(Produit produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }
// comparer deux magasin  selon nombre des produits

    public Magasin comparer(Magasin m) {
        if (this.capacite >= m.capacite) {
            return this;
        } else {
            return m;
        }
    }

    public void afficherEmployes() {
        for (int i = 0; i < nbrEmploye; i++) {
            System.out.println(employes[i]);
        }
    }

    public float calculStock() {
        float quantiteTotale = 0;
        for (Produit p : produits) {
            if (p.determinerTypeProduit().equals("Fruit")) {
                quantiteTotale = quantiteTotale + ((ProduitFruit) p).getQuantite();
            }
        }
        return quantiteTotale;
    }
}
