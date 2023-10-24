package td4;

public class Magazine extends Livre {
    private int moisParution;

    public Magazine(String titre, int identifiant, String domain, int nbPages, int moisParution) {
        super(titre, identifiant, domain, nbPages);
        this.moisParution = moisParution;
    }

    @Override
    public String toString() {
        super.toString();
        return "moisParution=" + moisParution ;
    }


    public double calculePrix(int bonus) {
        return (0.35 * nbPages)*(1+TVA)+bonus;
    }
}
