public class Appartement extends ParcImmobilier {

	private int nbpieces;
	private boolean louer;
	private int plgarages;
	private int plparking;
	private int numetage;
	private boolean exterieur;
	private double superficieexterieur;

	public Appartement(double prix, double superficie, String localisation, boolean louer,
	                   int nbpieces, int plgarages, boolean exterieur, double superficieexterieur,
	                   int plparking, int numetage) {
		super(prix, superficie, localisation);
		this.nbpieces = nbpieces;
		this.louer = louer;
		this.plgarages = plgarages;
		this.exterieur = exterieur;
		this.superficieexterieur = superficieexterieur;
		this.plparking = plparking;
		this.numetage = numetage;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getlocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
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
			System.out.println("L'appartement est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("L'appartement est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public int getPlgarages() {
		return plgarages;
	}

	public void setPlgarages(int plgarages) {
		if (plgarages >= 1) {
			System.out.println("L'appartement a " + plgarages + " garage(s).");
		} else {
			System.out.println("L'appartement n'a pas de garage.");
		}

		this.plgarages = plgarages;
	}

	public boolean isExterieur() {
		return exterieur;
	}

	public void setExterieur(boolean exterieur) {
		if (exterieur) {
			System.out.println("L'exterieur � une superficie de " + superficieexterieur + " m�.");
		} else {
			System.out.println("L'appartement n'a pas d'ext�rieur.");
		}

		this.exterieur = exterieur;
	}

	public double getSuperficieexterieur() {
		return superficieexterieur;
	}

	public void setSuperficieexterieur(double superficieexterieur) {
		this.superficieexterieur = superficieexterieur;
	}

	public int getPlparking() {
		return plparking;
	}

	public void setPlparking(int plparking) {
		if (plparking >= 1) {
			System.out.println("L'appartement a " + plparking + " place(s) de parking.");
		} else {
			System.out.println("L'appartement n'a pas de place de parking.");
		}

		this.plparking = plparking;
	}

	public int getNumetage() {
		return numetage;
	}

	public void setNumetage(int numetage) {
		if (this.exterieur && numetage >= 1) {
			System.out.println("L'ext�rieur de l'appartement est un balcon, une terrasse.");
		}

		this.numetage = numetage;
	}

	public String toString() {
		return "L'appartement est compos� de " + this.nbpieces + " pi�ces." + " La superficie de l'appartement est de "
				+ this.superficie + " m�." + " L'appartement est au " + this.numetage + "� �tage." + " Le bien se situe au "
				+ this.localisation + ".";
	}

}