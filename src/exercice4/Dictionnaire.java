package exercice4;

class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire() {
        super();
        this.langue = "Francais";
    }

    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire [Numero=" + numEnreg + ", Titre=" + titre + ", Langue=" + langue + "]";
    }
}
