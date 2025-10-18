package exercice4;

class Bibliotheque {
    private int capacite;

    public Bibliotheque() {
        this.capacite = 0;
    }

    public int getCapacite() {
        return capacite;
    }

    @Override
    public String toString() {
        return "Bibliotheque [Capacite=" + capacite + "]";
    }
}
