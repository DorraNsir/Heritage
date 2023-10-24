package td4;

public class Main {
    public static void main(String[] args) {
Librairie l1 =new Librairie(4);
Livre liv1=new Livre("javaScropt",1,"informatique",500);
Livre liv2=new Roman("django",2,"informatique",350,"dorra","loulou");
Livre liv4= new Magazine("Roman 1", 3, "Historical Fiction", 350,6);
l1.ajoutLiv(liv1);
l1.ajoutLiv(liv2);
l1.ajoutLiv(liv4);
l1.inventaire();
Livre liv3 = new Roman("Roman 2", 4, "Mystery", 280, "Author 2", "Publisher 2");
l1.ajoutLiv(liv3);
System.out.println("les livres de categorie informatique");
l1.inventaire("informatique");
        double PrixTotale = 0;
        for (int i = 0; i < l1.getNb(); i++) {
            if (l1.liste[i] instanceof Roman) {
                PrixTotale+= l1.liste[i].calculePrix();
            }
        }
        System.out.println("\n le prix totale des Romans = " + PrixTotale);
        Magazine magazine2 = new Magazine("Magazine 2", 5, "Health", 120, 7);
        l1.ajoutLiv(magazine2);
        //la librerie est pleine car la capacite=4





    }
}
