package tn.tuniprod.gestionmagasin.test;

import tn.tuniprod.gestionmagasin.classes.Produit;
import java.util.Date;
import tn.tuniprod.gestionmagasin.classes.Magasin;
import tn.tuniprod.gestionmagasin.classes.Caissier;
import tn.tuniprod.gestionmagasin.classes.Vendeur;
import tn.tuniprod.gestionmagasin.classes.Responsable;
public class Test {

   public static void main(String[] args) {

        Produit produit1 = new Produit();
        Produit  produit2 = new Produit(1021, "Lait", "Delice");
        Produit  produit3 = new Produit(2510, "yaourt", "Vitalait");
        Produit  produit4 = new Produit(3250, "Tomate", "Sicam", 1.200f);

  
        produit2.affecterPrix(0.7f);
//---------------------------------------
        Magasin m1 = new Magasin(12345, "Menzel Temime");
        System.out.println(m1);

     m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);
        
        System.out.println(m1);        
        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------
        Object o = new Object();
        Object pB=new Produit();
     Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);

        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
            System.out.println("SALAIRE :"+responsableM1.getSalaireEmploye());
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

        monoprix.ajouterProduit(produit2);
        monoprix.ajouterProduit(produit3);
        carrefour.ajouterProduit(produit3);
        carrefour.ajouterProduit(produit4);
        System.out.println("-------------");
        System.out.println(monoprix);
        System.out.println("-------------");
        System.out.println(carrefour);
        

    }

}

