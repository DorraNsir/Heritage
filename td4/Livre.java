package td4;

public class Livre {
    protected String titre;
    protected int identifiant ;
    protected final double TVA=0.1;
    protected String domain ;
    protected int nbPages;

    public Livre(String titre, int identifiant, String domain, int nbPages) {
        this.titre = titre;
        this.identifiant = identifiant;
        this.domain = domain;
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                "titre='" + titre + '\'' +
                ", identifiant=" + identifiant +
                ", TVA=" + TVA +
                ", domain='" + domain + '\'' +
                ", nbPage=" + nbPages ;
    }
    public double calculePrix(){
        return ((0.075 * nbPages)*(1+TVA));
    }
}
