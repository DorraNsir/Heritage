package Heritage;

public class Salarie {
    public final String test="salarie";
    protected int Matricule;
    protected  String nom;
    protected int Recrutement;

    public Salarie(int matricule, String nom, int recrutement) {
        Matricule = matricule;
        this.nom = nom;
        Recrutement = recrutement;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRecrutement(int recrutement) {
        Recrutement = recrutement;
    }

    public int getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return nom;
    }

    public double getRecrutement() {
        return Recrutement;
    }

    @Override
    public String toString() {
        return
                "Matricule=" + Matricule +
                ", nom='" + nom +
                ", Recrutement=" + Recrutement ;
    }
    public String affiche(){
        return this.toString();
    }
    public double Salaire(){
        double Salaire=0;
        if(this.Recrutement<2005){
            return Salaire=400;
        }
        return Salaire= 280;
    }
    public static int teste(Salarie[] tabSalarie ){
        int min = tabSalarie[0].Recrutement;
        int index=0;
        for (int i = 0; i < tabSalarie.length; i++) {
            if (min > tabSalarie[i].Recrutement) {
                min = tabSalarie[i].Recrutement;
                index=i;
            }
        }
        return index;
    }

}
