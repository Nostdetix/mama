
import java.util.ArrayList;

public class Maisons extends ParcImmobilier {

	private  boolean louer;
	private int nbpieces;
	private  int nbgarages;
	private  boolean exterieur;
	private double superficieexterieur;

	public Maisons(boolean louer, double prix, double superficie, String localisation, int nbpieces, int nbgarages, boolean exterieur, double superficieexterieur) {
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
		if (louer == true) {
			System.out.println("La maison est à louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("La maison est à vendre. Le prix est de " + this.prix + " euros.");
		}

	}

	public int getNbgarages() {
		return nbgarages;
	}

	public void setNbgarages(int nbgarages) {
		if (nbgarages >= 1) {
			System.out.println("La maison est composé de " + nbgarages + " garage(s).");
		} else {
			System.out.println("La maison n'a pas de garage.");
		}

	}

	public boolean isExterieur() {
		return exterieur;
	}

	public void setExterieur(boolean exterieur) {
		if (exterieur == true) {
			System.out.println("L'exterieur à une superficie de "+ superficieexterieur + " m².");
		} else {
			System.out.println("La maison n'a pas d'extérieur.");
		}
	}

	public double getSuperficieexterieur() {
		return superficieexterieur;
	}

	public void setSuperficieexterieur(double superficieexterieur) {
		this.superficieexterieur = superficieexterieur;
	}

	public String toString() {
		String l = "La maison est composé de " + this.nbpieces + " pièces." + " La superficie de la maison est de " + this.superficie + " m²." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}

	
}