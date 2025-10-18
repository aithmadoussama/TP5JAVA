package exercice4;

class Roman extends Livre {
    private double prix;

    public Roman() {
        super();
        this.prix = 0.0;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Roman [Numero=" + numEnreg + ", Titre=" + titre + ", Auteur=" + auteur + ", Pages=" + nbrPages + ", Prix=" + prix + "]";
    }
}
