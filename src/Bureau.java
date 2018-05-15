public class Bureau extends ParcImmobilier {

	private boolean louer;
	private int nbpieces;

	public Bureau(double prix, double superficie, String localisation, boolean louer, int nbpieces) {
		super(prix, superficie, localisation);
		this.louer = louer;
		this.nbpieces = nbpieces;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer) {
			System.out.println("Le bureau est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le bureau est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public int getNbpieces() {
		return nbpieces;
	}

	public void setNbpieces(int nbpieces) {
		this.nbpieces = nbpieces;
	}

	public String toString() {
		return "La superficie du bureau est de " + this.superficie + " m�." + " Le bien se situe au " + this.localisation + ".";
	}
}
