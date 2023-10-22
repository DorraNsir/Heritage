package Heritage;

public class Vendeur extends Heritage.Salarie {
    public final String test="vendeur";
    private double Vente;
    private double Pourcentage;

    public Vendeur(int Matricule,String nom,int recrutement,double vente, double pourcentage) {
        super(Matricule,nom,recrutement);
        Vente = vente;
        Pourcentage = pourcentage;
    }

    public void setVente(double vente) {
        Vente = vente;
    }

    public void setPourcentage(double pourcentage) {
        Pourcentage = pourcentage;
    }

    public double getVente() {
        return Vente;
    }

    public double getPourcentage() {
        return Pourcentage;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "Vente=" + Vente +
                ", Pourcentage=" + Pourcentage;
    }

    @Override
    public String affiche() {
        System.out.println(this.getClass().getSimpleName());
        return this.toString();
    }
    @Override
    public double Salaire() {
        double Salaire=(this.Vente*this.Pourcentage)+super.Salaire();
        return Salaire;
    }


}
