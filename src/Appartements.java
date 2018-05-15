



public class Appartements extends ParcImmobilier {

	private int nbpieces;
	private  boolean louer;
	private  int plgarages;
	private  int plparking;
	private int numetage;
	private  boolean exterieur;
	private double superficieexterieur;

	public Appartements(double prix, double superficie, String localisation, int nbpieces, boolean louer, int plgarages, boolean exterieur, double superficieexterieur, int plparking, int numetage) {
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
		if (louer == true) {
			System.out.println("L'appartement est à louer. Le prix est de "+ this.prix + " euros " + "par mois.");
		} else {
			System.out.println("L'appartement est à vendre. Le prix est de " + this.prix + " euros.");
		}
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

	}

	public boolean isExterieur() {
		return exterieur;
	}

	public void setExterieur(boolean exterieur) {
		if (exterieur == true) {
			System.out.println("L'exterieur à une superficie de " + superficieexterieur + " m².");
		} else {
			System.out.println("L'appartement n'a pas d'extérieur.");
		}
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
		if (plgarages >= 1) {
			System.out.println("L'appartement a " + plparking + " place(s) de parking.");
		} else {
			System.out.println("L'appartement n'a pas de place de parking.");
		}
	}

	public int getNumetage() {
		return numetage;
	}

	public void setNumetage(int numetage) {
		if (exterieur == true && numetage >= 1){
		System.out.println("L'extérieur de l'appartement est un balcon, une terrasse.");
		}
	}

	public String toString() {
		String l = "L'appartement est composé de " + this.nbpieces + " pièces." + " La superficie de l'appartement est de " + this.superficie + " m²." + " L'appartement est au " + this.numetage + "° étage." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}

}