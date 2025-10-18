package exercice4;

class Livre extends Document {
    protected String auteur;
    protected int nbrPages;

    public Livre() {
        super();
        this.auteur = "Inconnu";
        this.nbrPages = 0;
    }

    public Livre(int numEnreg, String titre, String auteur, int nbrPages) {
        super(numEnreg, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    @Override
    public String toString() {
        return "Livre [Numero=" + numEnreg + ", Titre=" + titre + ", Auteur=" + auteur + ", Pages=" + nbrPages + "]";
    }
}
