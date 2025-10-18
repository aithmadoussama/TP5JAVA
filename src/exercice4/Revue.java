package exercice4;

class Revue extends Document {
	private String mois;
	private int annee;

	public Revue() {
		super();
		this.mois = "Janvier";
		this.annee = 2000;
	}

	public String getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

	@Override
	public String toString() {
		return "Revue [Numero=" + numEnreg + ", Titre=" + titre + ", Mois=" + mois + ", Annee=" + annee + "]";
	}
}
