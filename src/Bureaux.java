



public class Bureaux extends ParcImmobilier {

	private  boolean louer;
	private int nbpieces;

	public Bureaux(boolean louer, double prix, double superficie, String localisation, int nbpieces) {
		super(prix, superficie, localisation);
		this.louer = louer;
		this.nbpieces = nbpieces;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer == true) {
			System.out.println("Le bureau est à louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("Le bureau est à vendre. Le prix est de " + this.prix + " euros.");
		}
	}

	public int getNbpieces() {
		return nbpieces;
	}

	public void setNbpieces(int nbpieces) {
		this.nbpieces = nbpieces;
	}
	
	public String toString() {
		String l = "La superficie du bureau est de "+ this.superficie + " m²." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}

	
}
