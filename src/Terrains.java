


public class Terrains extends ParcImmobilier {

	private  boolean louer;

	public Terrains(boolean louer, double prix, double superficie, String localisation) {
		super(prix, superficie, localisation);
		this.louer = louer;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer == true) {
			System.out.println("Le terrain est à louer. Le prix est de "+ this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le terrain est à vendre. Le prix est de " + this.prix + " euros.");
		}
	}

	public String toString() {
		String l = "La superficie du terrain est de " + this.superficie + " m²." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}
}
