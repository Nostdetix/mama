


public class Garages extends ParcImmobilier {

	
	private  boolean louer;

	public Garages(boolean louer, double prix, double superficie, String localisation) {
		super(prix, superficie, localisation);
		this.louer = louer;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer == true) {
			System.out.println("Le garage est à louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le garage est à vendre. Le prix est de " + this.prix + " euros.");
		}
	}

	public String toString() {
		String l = "La superficie du garage est de " + this.superficie + " m²." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}

	
}
