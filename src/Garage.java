public class Garage extends ParcImmobilier {

	private boolean louer;

	public Garage(double prix, double superficie, String localisation, boolean louer) {
		super(prix, superficie, localisation);
		this.louer = louer;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer) {
			System.out.println("Le garage est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le garage est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public String toString() {
		return "La superficie du garage est de " + this.superficie + " m�." + " Le bien se situe au " + this.localisation + ".";
	}
}
