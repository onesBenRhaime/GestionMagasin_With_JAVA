package tn.tuniprod.gestionmagasin.test;

import tn.tuniprod.gestionmagasin.classes.Produit;
import java.util.Date;
import tn.tuniprod.gestionmagasin.classes.Magasin;
import tn.tuniprod.gestionmagasin.classes.Caissier;
import tn.tuniprod.gestionmagasin.classes.MagasinPleinException;
import tn.tuniprod.gestionmagasin.classes.PrixNegatifException;
import tn.tuniprod.gestionmagasin.classes.Vendeur;
import tn.tuniprod.gestionmagasin.classes.Responsable;
import tn.tuniprod.gestionmagasin.classes.ProduitAgricole;
import tn.tuniprod.gestionmagasin.classes.ProduitFruit;
import tn.tuniprod.gestionmagasin.classes.ProduitLegume;

public class Test {

    public static void main(String[] args) throws MagasinPleinException {

//        Produit produit1 = new Produit();
//        Produit produit2 = new Produit(1021, "Lait", "Delice");
//        Produit produit3 = new Produit(2510, "yaourt", "Vitalait");
//      
//---------------------------------------
        Magasin m1 = new Magasin(12345, "Menzel Temime");
        System.out.println(m1);
//
//        m1.ajouterProduit(produit1);
//        m1.ajouterProduit(produit2);
//        m1.ajouterProduit(produit3);

        System.out.println(m1);
        System.out.println("Total des Produits  " + m1.getTotalProduits());
//---------------------------------------
        Object o = new Object();
        Object pB = new Produit();
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);

        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
        System.out.println("SALAIRE :" + responsableM1.getSalaireEmploye());
        monoprix.ajouterEmploye(caissierC1);
        monoprix.ajouterEmploye(caissierC2);
        monoprix.ajouterEmploye(vendeurC1);
        monoprix.ajouterEmploye(responsableC1);

        carrefour.ajouterEmploye(caissierM1);
        carrefour.ajouterEmploye(vendeurM1);
        carrefour.ajouterEmploye(responsableM1);

//        System.out.println("-------------");
//        monoprix.afficherEmployes();
//        System.out.println("-------------");
//        carrefour.afficherEmployes();
//        monoprix.ajouterProduit(produit2);
//        monoprix.ajouterProduit(produit3);
//        carrefour.ajouterProduit(produit3);
//        carrefour.ajouterProduit(produit4);
//        System.out.println("-------------");
//        System.out.println(monoprix);
//        System.out.println("-------------");
//        System.out.println(carrefour);
//------------------
//        ProduitFruit p1 = new ProduitFruit(12.3f, "mars", "Fruit", 1254, "Fraise", "", 10);
//        ProduitFruit p2 = new ProduitFruit(50f, "juin", "Fruit", 1224, "Pastèque", "", 0);
//        ProduitFruit p3 = new ProduitFruit(25.6f, "décembre", "Fruit", 7896, "Mandarine", "", 10);
//        ProduitLegume p4 = new ProduitLegume(14f, "janvier", "Légumes", 8521, "Artichauts", "", 0);
//        System.out.println("/****** p1 :\n " + p1);
//
//        Magasin Les400gouts = new Magasin(3, "Les 400 Gouts", "Sousse");
//        Les400gouts.ajouterProduit(p1);
//        Les400gouts.ajouterProduit(p2);
//        Les400gouts.ajouterProduit(p3);
//        Les400gouts.ajouterProduit(p4);
//        System.out.println(" Les 400 Gouts :[*** \n" + Les400gouts + " \n ***]");
//        System.out.println(p1.determinerTypeProduit());
//        System.out.println(Les400gouts.calculStock());
//        System.out.println(p1.estFrais("mars"));
//        System.out.println(p4.estFrais("décembre"));
//------------------Prosit6-------------------------------------------------------
        Magasin aziza = new Magasin(3, "Les 400 Gouts", "Sousse");
        ProduitFruit p1 = null;
        ProduitFruit p2= null;
        ProduitFruit p3= null;
        ProduitFruit p4= null;
        try {
            p1 = new ProduitFruit(12.3f, "mars", "Fruit", 1254, "Fraise", "", 10);
        }catch (PrixNegatifException ex) {
            System.out.print(ex.getMessage());
        }
        try {
            p2 = new ProduitFruit(50f, "juin", "Fruit", 1224, "Pastèque", "", 0);
        } catch (PrixNegatifException ex) {
            System.out.print(ex.getMessage());
        }
        try {
            p3 = new ProduitFruit(25.6f, "décembre", "Fruit", 7896, "Mandarine", "", 10);
        } catch (PrixNegatifException ex) {
            System.out.print(ex.getMessage());
        }
       

        try {
            aziza.ajouterProduit(p1);
            aziza.ajouterProduit(p2);
            aziza.ajouterProduit(p3);
            aziza.ajouterProduit(p4);
        } catch (MagasinPleinException ex) {System.err.println(ex.getMessage());}
        System.out.println(" AZIZA:[*** \n" + aziza + " \n ***]");
    }

}
