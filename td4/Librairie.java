package td4;

public class Librairie {
    private Livre[] liste;
    private int capacite;
    private static int nb=0;

    public Librairie() {
        this.liste=new Livre[capacite];
        nb++;
    }

    public static int getNb() {
        return nb;
    }
    public void inventaire(){
        for(int i=0;i<capacite;i++){
            System.out.println(liste[i].toString());
            System.out.println(liste[i].calculePrix());
        }
    }
    public void inventaire(String categ){
        for(int i=0;i<capacite;i++){
            if( liste[i].domain==categ){
                System.out.println(liste[i].toString());
            }
        }
    }
    public void ajoutLiv(Livre liv) {
        if (nb < capacite) {
            liste[nb] = liv;
            nb++;
        } else {
            System.out.println("La librairie est pleine");
        }
    }
    public void suppLiv(int num) {
        for (int i = 0; i < capacite; i++) {
            if (liste[i].identifiant == num) {
                for (int j = i; j < capacite - 1; j++) {
                    liste[j] = liste[j + 1];
                }
                liste[nb - 1] = null;
                nb--;
                break;
            }
        }
        System.out.println("l'identifiant " + num +" n'est pas trouvee");
    }

}
