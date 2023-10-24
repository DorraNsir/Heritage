package td4;

public class Roman extends Livre{
    private String nomAuteur;
    private String nomEditeur;

    public Roman(String titre, int identifiant, String domain, int nbPages, String nomAuteur, String nomEditeur) {
        super(titre, identifiant, domain, nbPages);
        this.nomAuteur = nomAuteur;
        this.nomEditeur = nomEditeur;
    }

    @Override
    public String toString() {
        super.toString();
        return "nomAuteur='" + nomAuteur + '\'' +
                ", nomEditeur='" + nomEditeur ;

    }

    @Override
    public double calculePrix() {
        return (0.05 * nbPages)*(1+TVA);
    }
}
