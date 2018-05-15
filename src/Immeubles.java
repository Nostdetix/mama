import java.util.ArrayList;

public class Immeubles extends ParcImmobilier {

	private  boolean louer;
	private int nbpieces;
	private  int garages;
	private  int parking;
	private  int etages;
	private  ArrayList<Appartements>appartements = new ArrayList<Appartements>();
	private  ArrayList<Bureaux> bureaux = new ArrayList<Bureaux>(); 

	public Immeubles(boolean louer, double prix, double superficie, String localisation, int nbpieces, int garages, int parking, int etages,ArrayList<Appartements>appartements,ArrayList<Bureaux> bureaux ) {
		super(prix, superficie, localisation);
		this.louer = louer;
		this.nbpieces = nbpieces;
		this.garages = garages;
		this.parking = parking;
		this.etages = etages;
      
	}
	public  ArrayList<Appartements> getAppartements() { 
        return appartements; 
    } 

    public  void setAppartements(ArrayList<Appartements> appartements) { 
      this.appartements = appartements; 
    } 
    public  ArrayList<Bureaux> getBureaux() { 
    	return bureaux; 
    } 
    public  void setBureaux(ArrayList<Bureaux> bureaux) { 
        this.bureaux = bureaux; 
    } 
	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		if (louer == true) {
			System.out.println("L'immeuble est à louer. Le prix est de "+ this.prix + " euros " + "par mois.");
		} else {
			System.out.println("L'immeuble est à vendre. Le prix est de " + this.prix + " euros.");
		}
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
	}
	
	public int getEtages() {
		return etages;
	}

	public void setEtages(int etages) {
			System.out.println("L'immeuble a " + etages + " étages.");
	}
	
	
	public String toString() {
		String l = "L'immeuble a " + this.nbpieces + " pièces." + " La superficie de l'immeuble est de " + this.superficie + " m²." + " Le bien se situe au " + this.localisation + ".";
		return l;
	}
	
	
}
