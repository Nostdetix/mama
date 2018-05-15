import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParcImmobilier {

	public static ArrayList<ParcImmobilier> parcImmobilier = new ArrayList<ParcImmobilier>();

	protected double prix;
	protected double superficie;
	protected String localisation;

	public ParcImmobilier(double prix, double superficie, String localisation) {
		this.prix = prix;
		this.superficie = superficie;
		this.localisation = localisation;
	}

	public static void sauverParcImmobilier() throws IOException {
		try {

			File txt = new File("C:\\\\Users\\\\Maëlys Fourreau\\\\Documents\\\\Cours L1\\\\Algo\\\\Save.txt");
			txt.createNewFile();
			FileWriter ffw = new FileWriter(txt);
			for (int k = 0; k < parcImmobilier.size(); k++) {
				ffw.write("\n\r" + parcImmobilier.get(k).toString() + "\n\r");
			}
			ffw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void exitMenu() {
		System.out.println("Appuyez sur une touche pour sortir...");
		Scanner sc = new Scanner(System.in);

		if (sc.nextLine() != null) {
			menu();
		}
	}

	private static void insert() {
		System.out.println("Inserer un nouveau bien ...");
		System.out.println("Quel type de bien :");
		Scanner clavier = new Scanner(System.in);

		switch (clavier.nextLine().toLowerCase()) {
			case "immeubles": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				System.out.println("Nombre de pièces");
				Scanner clavierPieces = new Scanner(System.in);
				int nbpieces = clavierPieces.nextInt();

				ParcImmobilier p0 = new ParcImmobilier(prix, superficie, localisation);
				parcImmobilier.add(p0);

				System.out.println("Vous avez ajouté : " + p0.getClass() + " " + p0.getSuperficie() + " " + p0.getPrix() + " euro" + " " + p0.getLocalisation());

				break;

			}
			case "garages": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				System.out.println("Louer:");
				Scanner clavierLouer = new Scanner(System.in);
				boolean louer = clavierLouer.nextBoolean();

				ParcImmobilier g0 = new Garage(prix, superficie, localisation, louer);
				parcImmobilier.add(g0);

				System.out.println("Vous avez ajouté : " + g0.getClass() + " " + ((Garage) g0).isLouer() + " " + g0.getPrix() + " euro " + g0.getSuperficie() + " m² " + g0.getLocalisation());

				break;
			}
			case "commerces": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				System.out.println("Louer:");
				Scanner clavierLouer = new Scanner(System.in);
				boolean louer = clavierLouer.nextBoolean();

				ParcImmobilier c0 = new Commerce(prix, superficie, localisation, louer);
				parcImmobilier.add(c0);

				System.out.println("Vous avez ajouté : " + c0.getClass() + " " + ((Commerce) c0).isLouer() + " " + c0.getPrix() + " euro " + c0.getSuperficie() + " m² " + c0.getLocalisation());

				break;
			}
			case "terrains": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				System.out.println("Louer:");
				Scanner clavierLouer = new Scanner(System.in);
				boolean louer = clavierLouer.nextBoolean();

				ParcImmobilier t0 = new Terrain(prix, superficie, localisation, louer);
				parcImmobilier.add(t0);

				System.out.println("Vous avez ajouté : " + t0.getClass() + " " + ((Terrain) t0).isLouer() + " " + t0.getPrix() + " euro " + t0.getSuperficie() + " m² " + t0.getLocalisation());

				break;
			}
			case "bureaux": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				System.out.println("Louer");
				Scanner clavierLouer = new Scanner(System.in);
				boolean louer = clavierLouer.nextBoolean();

				System.out.println("Nombre de pièces");
				Scanner clavierPieces = new Scanner(System.in);
				int nbpieces = clavierPieces.nextInt();

				ParcImmobilier b0 = new Bureau(prix, superficie, localisation, louer, nbpieces);
				parcImmobilier.add(b0);

				System.out.println("Vous avez ajouté : " + b0.getClass() + " " + b0.getPrix() + " euro " + b0.getSuperficie() + " m² " + b0.getLocalisation());
				break;

			}
			case "maisons": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				ParcImmobilier m0 = new ParcImmobilier(prix, superficie, localisation);
				parcImmobilier.add(m0);

				System.out.println("Vous avez ajouté : " + m0.getClass() + " " + m0.getPrix() + " euro " + m0.getSuperficie() + " m² " + m0.getLocalisation());

				break;
			}
			case "appartements": {
				System.out.println("Prix:");
				Scanner clavierPrix = new Scanner(System.in);
				double prix = clavierPrix.nextInt();

				System.out.println("Superficie:");
				Scanner clavierSuperficie = new Scanner(System.in);
				double superficie = clavierSuperficie.nextInt();

				System.out.println("Localisation:");
				Scanner clavierLocalisation = new Scanner(System.in);
				String localisation = clavierLocalisation.nextLine();

				ParcImmobilier a0 = new ParcImmobilier(prix, superficie, localisation);
				parcImmobilier.add(a0);

				System.out.println("Vous avez ajouté : " + a0.getClass() + " " + a0.getPrix() + " euro " + a0.getSuperficie() + " m² " + a0.getLocalisation());

				break;
			}

			default:
				break;
		}

		exitMenu();
	}

	private static void remove() {
		for (int i = 0; i < parcImmobilier.size(); i++) {
			ParcImmobilier p0 = parcImmobilier.get(i);
			System.out.println(i + " " + p0.getClass() + " " + p0.getPrix() + " euro" + " " + p0.getLocalisation());
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		ParcImmobilier p0 = parcImmobilier.get(choix);
		System.out.println("Voulez vous supprimer :" + choix + " " + p0.getClass() + " " + p0.getPrix() + " euro " + p0.getLocalisation() + "  0: oui / 1: non");
		Scanner clavierConfirm = new Scanner(System.in);
		int confirm = clavierConfirm.nextInt();
		if (confirm == 0) {
			System.out.println("Bien N° " + choix + " supprimé. \n");
			parcImmobilier.remove(choix);

		}

		for (int i = 0; i < parcImmobilier.size(); i++) {
			ParcImmobilier p1 = parcImmobilier.get(i);
			System.out.println(i + " " + p1.getClass() + " " + p1.getPrix() + " euro " + p1.getLocalisation());

		}
		exitMenu();
	}

	private static void choose() {
		for (int i = 1; i < parcImmobilier.size(); i++) {
			ParcImmobilier p0 = parcImmobilier.get(i);
			System.out.println(i + " " + p0.getClass() + " " + p0.getPrix() + " euro " + p0.getLocalisation());
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		ParcImmobilier p0 = parcImmobilier.get(choix);
		System.out.println(parcImmobilier.get(choix).toString() + "/n");
		System.out.println("Changer le prix du bien ? 0: Oui / 1: Non");
		Scanner clavierConfirm = new Scanner(System.in);
		int confirm = clavierConfirm.nextInt();
		if (confirm == 0) {
			System.out.println("Indiquez le nouveau prix :");
			Scanner clavierPrix = new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Le nouveau prix de " + p0.getClass() + " " + p0.getPrix() + " euro " + p0.getLocalisation() + " est de: " + prix);
		}

		exitMenu();
	}

	public static void menu() {

		System.out.println("1: Inserer des biens \n" + "2: Supprimer des biens\n" + "3: Choisir un bien");
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		switch (choix) {
			case 1: {
				insert();
				break;
			}
			case 2: {
				remove();
				break;
			}
			case 3: {
				choose();
				break;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		parcImmobilier.addAll(Utilitaire.creerMaisons());
		parcImmobilier.addAll(Utilitaire.creerAppartements());
		parcImmobilier.addAll(Utilitaire.creerBureaux());
		parcImmobilier.addAll(Utilitaire.creerCommerces());
		parcImmobilier.addAll(Utilitaire.creerGarages());
		parcImmobilier.addAll(Utilitaire.creerImmeubles());
		parcImmobilier.addAll(Utilitaire.creerTerrains());

		sauverParcImmobilier();
		menu();
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

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public void chargerParcImmobilier(String Immo) {
		try {
			File f = new File(Immo);
			Scanner parcimmo = new Scanner(f);
			while (parcimmo.hasNext()) {
				parcImmobilier.add(null);
			}
			parcimmo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}