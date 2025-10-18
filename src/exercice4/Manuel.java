package exercice4;

class Manuel extends Livre {
    private String niveau;

    public Manuel() {
        super();
        this.niveau = "Primaire";
    }

    public String getNiveau() {
        return niveau;
    }

    @Override
    public String toString() {
        return "Manuel [Numero=" + numEnreg + ", Titre=" + titre + ", Auteur=" + auteur + ", Pages=" + nbrPages + ", Niveau=" + niveau + "]";
    }
}
