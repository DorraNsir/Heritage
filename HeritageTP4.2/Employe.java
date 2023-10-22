package Heritage;

public class Employe extends Heritage.Salarie {
   public   final String test="employee";
    private double Hsupp;
    private double PHsupp;

    public Employe(int Matricule,String nom,int recrutement,double hsupp, double PHsupp) {
        super(Matricule,nom,recrutement);
        Hsupp = hsupp;
        this.PHsupp = PHsupp;
    }

    public void setHsupp(double hsupp) {
        Hsupp = hsupp;
    }

    public void setPHsupp(double PHsupp) {
        this.PHsupp = PHsupp;
    }

    public double getHsupp() {
        return Hsupp;
    }

    public double getPHsupp() {
        return PHsupp;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "Hsupp=" + Hsupp +
                ", PHsupp=" + PHsupp ;
    }
    @Override
    public String affiche(){
        System.out.println(this.getClass().getSimpleName());
        return this.toString();
    }

    @Override
    public double Salaire() {
        double Salaire=(this.Hsupp*this.PHsupp)+super.Salaire();
        return Salaire;
    }
}
