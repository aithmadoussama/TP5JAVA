package exercice4;

class Document {
    protected int numEnreg;
    protected String titre;

    public Document() {
        this.numEnreg = 0;
        this.titre = "Sans titre";
    }

    public Document(int numEnreg, String titre) {
        this.numEnreg = numEnreg;
        this.titre = titre;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document [Numero=" + numEnreg + ", Titre=" + titre + "]";
    }
}