public class Terrain extends ParcImmobilier {

	private boolean louer;

	public Terrain(double prix, double superficie, String localisation, boolean louer) {
		super(prix, superficie, localisation);
		this.louer = louer;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer) {
			System.out.println("Le terrain est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le terrain est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public String toString() {
		return "La superficie du terrain est de " + this.superficie + " m�." + " Le bien se situe au " + this.localisation + ".";
	}
}
