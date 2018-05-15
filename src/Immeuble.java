import java.util.ArrayList;

public class Immeuble extends ParcImmobilier {

	private boolean louer;
	private int nbpieces;
	private int garages;
	private int parking;
	private int etages;
	private ArrayList<Appartement> appartements = new ArrayList<Appartement>();
	private ArrayList<Bureau> bureaux = new ArrayList<Bureau>();

	public Immeuble(double prix, double superficie, String localisation, boolean louer, int nbpieces, int garages, int parking, int etages, ArrayList<Appartement> appartements, ArrayList<Bureau> bureaux) {
		super(prix, superficie, localisation);
		this.louer = louer;
		this.nbpieces = nbpieces;
		this.garages = garages;
		this.parking = parking;
		this.etages = etages;

	}

	public ArrayList<Appartement> getAppartements() {
		return appartements;
	}

	public void setAppartements(ArrayList<Appartement> appartements) {
		this.appartements = appartements;
	}

	public ArrayList<Bureau> getBureaux() {
		return bureaux;
	}

	public void setBureaux(ArrayList<Bureau> bureaux) {
		this.bureaux = bureaux;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer) {
			System.out.println("L'immeuble est � louer. Le prix est de " + this.prix + " euros " + "par mois.");
		} else {
			System.out.println("L'immeuble est � vendre. Le prix est de " + this.prix + " euros.");
		}

		this.louer = louer;
	}

	public int getNbpieces() {
		return nbpieces;
	}

	public void setNbpieces(int nbpieces) {
		this.nbpieces = nbpieces;
	}

	public int getGarages() {
		return garages;
	}

	public void setGarages(int garages) {
		if (garages >= 1) {
			System.out.println("L'immeuble a " + garages + " garage(s).");
		} else {
			System.out.println("L'immeuble n'a pas de garage.");
		}

		this.garages = garages;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		if (parking >= 1) {
			System.out.println("L'immeuble a " + parking + " parking(s).");
		} else {
			System.out.println("L'immeuble n'a pas de parking.");
		}

		this.parking = parking;
	}

	public int getEtages() {
		return etages;
	}

	public void setEtages(int etages) {
		System.out.println("L'immeuble a " + etages + " �tages.");
		this.etages = etages;
	}

	public String toString() {
		return "L'immeuble a " + this.nbpieces + " pi�ces." + " La superficie de l'immeuble est de " + this.superficie + " m�." + " Le bien se situe au " + this.localisation + ".";
	}
}
