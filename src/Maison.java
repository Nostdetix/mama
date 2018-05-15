public class Maison extends ParcImmobilier {

	private boolean louer;
	private int nbpieces;
	private int nbgarages;
	private boolean exterieur;
	private double superficieexterieur;

	public Maison(double prix, double superficie, String localisation, boolean louer,
	              int nbpieces, int nbgarages, boolean exterieur, double superficieexterieur) {
		super(prix, superficie, localisation);
		this.louer = louer;
		this.nbpieces = nbpieces;
		this.nbgarages = nbgarages;
		this.exterieur = exterieur;
		this.superficieexterieur = superficieexterieur;
	}

	public int getNbpieces() {
		return nbpieces;
	}

	public void setNbpieces(int nbpieces) {
		this.nbpieces = nbpieces;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer) {
			System.out.println("La maison est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("La maison est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public int getNbgarages() {
		return nbgarages;
	}

	public void setNbgarages(int nbgarages) {
		if (nbgarages >= 1) {
			System.out.println("La maison est compos� de " + nbgarages + " garage(s).");
		} else {
			System.out.println("La maison n'a pas de garage.");
		}

		this.nbgarages = nbgarages;
	}

	public boolean isExterieur() {
		return exterieur;
	}

	public void setExterieur(boolean exterieur) {
		if (exterieur) {
			System.out.println("L'exterieur � une superficie de " + superficieexterieur + " m�.");
		} else {
			System.out.println("La maison n'a pas d'ext�rieur.");
		}

		this.exterieur = exterieur;
	}

	public double getSuperficieexterieur() {
		return superficieexterieur;
	}

	public void setSuperficieexterieur(double superficieexterieur) {
		this.superficieexterieur = superficieexterieur;
	}

	public String toString() {
		return "La maison est compos� de " + this.nbpieces + " pi�ces." + " La superficie de la maison est de " + this.superficie + " m�." + " Le bien se situe au " + this.localisation + ".";
	}
}