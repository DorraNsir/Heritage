package td4;

public class Librairie {
    public Livre[] liste;
    private int capacite;
    private static int nb=0;

    public Librairie(int capacite) {
        this.capacite=capacite;
        this.liste=new Livre[capacite];
    }

    public static int getNb() {
        return nb;
    }
    public void inventaire(){
        for(int i=0;i<nb;i++){
            System.out.println(liste[i].toString());
            System.out.println("Prix = "+liste[i].calculePrix());
        }
    }
    public void inventaire(String categ){
        for(int i=0;i<nb;i++){
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
        for (int i = 0; i < nb; i++) {
            if (liste[i].identifiant == num) {
                for (int j = i; j < nb - 1; j++) {
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
