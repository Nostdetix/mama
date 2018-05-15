import java.util.ArrayList;

public class Gestion {

	public static void ImAppart(ArrayList<Appartement> appartements, ArrayList<Immeuble> immeubles) {
		for (int i = 0; i < immeubles.size(); i++) {
			ArrayList<Appartement> a = immeubles.get(i).getAppartements();
			for (int k = 0; k < appartements.size(); k++) {
				if (immeubles.get(i).getLocalisation().equals(appartements.get(k).getLocalisation())) {
					a.add(appartements.get(k));
					immeubles.get(i).setAppartements(a);
					System.out.println("Cet appartement appartient � l'immeuble " + immeubles.get(i).getLocalisation());
				}
			}
		}
	}

	public static void ImBur(ArrayList<Bureau> bureaux, ArrayList<Immeuble> immeubles) {
		for (int i = 0; i < immeubles.size(); i++) {
			ArrayList<Bureau> b = immeubles.get(i).getBureaux();
			for (int k = 0; k < bureaux.size(); k++) {
				if (immeubles.get(i).getLocalisation().equals(bureaux.get(k).getLocalisation())) {
					b.add(bureaux.get(k));
					immeubles.get(i).setBureaux(b);
					System.out.println("Ce bureau appartient � l'immeuble " + bureaux.get(i).getLocalisation());
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Maison> maisons = Utilitaire.creerMaisons();
		ArrayList<Appartement> appartements = Utilitaire.creerAppartements();
		ArrayList<Bureau> bureaux = Utilitaire.creerBureaux();
		ArrayList<Commerce> commerces = Utilitaire.creerCommerces();
		ArrayList<Terrain> terrains = Utilitaire.creerTerrains();
		ArrayList<Garage> garages = Utilitaire.creerGarages();
		ArrayList<Immeuble> immeubles = Utilitaire.creerImmeubles();

		ImAppart(appartements, immeubles);
		ImBur(bureaux, immeubles);
//        System.out.println(i1.getAppartements()); 
//        System.out.println(i2.getAppartements()); 
//        System.out.println(i3.getAppartements()); 
//        System.out.println(i4.getAppartements()); 
	}
}