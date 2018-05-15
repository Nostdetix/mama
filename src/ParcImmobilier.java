import java.util.ArrayList;
import java.util.List;
import java.awt.geom.AffineTransform;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Scanner; 


public class ParcImmobilier {


	protected double prix;
	protected double superficie;
	protected String localisation;
	public static ArrayList <ParcImmobilier> parcimmobilier= new ArrayList <ParcImmobilier>();
	public static ArrayList <Immeubles> immeubles= new ArrayList <Immeubles>();
	public static ArrayList <Garages> garages= new ArrayList <Garages>();
	public static ArrayList <Commerces> commerces= new ArrayList <Commerces>();
	public static ArrayList <Terrains> terrains= new ArrayList <Terrains>();
	public static ArrayList <Bureaux> bureaux= new ArrayList <Bureaux>();
	public static ArrayList <Maisons> maisons= new ArrayList <Maisons>();
	public static ArrayList <Appartements> appartements= new ArrayList <Appartements>();
	
	public ParcImmobilier(double prix, double superficie, String localisation) {
		this.prix = prix;
		this.superficie = superficie;
		this.localisation = localisation;
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
	
	
	
	public static void ajouterparcimmobilier(double Prix, double Superficie, String Localisation) { 
		ParcImmobilier p0 = new ParcImmobilier (Prix, Superficie, Localisation); 
		parcimmobilier.add(p0); 
	} 
	public static void ajouterimmeubles(boolean louer, double prix, double superficie, String localisation, int nbpieces, int garages, int parking, int etages,ArrayList<Appartements>appartements,ArrayList<Bureaux> bureaux) { 
		Immeubles i0 = new Immeubles ( louer,  prix, superficie,  localisation,  nbpieces, garages,  parking,  etages,appartements, bureaux); 
		immeubles.add(i0);
	}
	public static void ajoutergarages(boolean louer,double Prix, double Superficie, String Localisation) { 
		Garages g0 = new Garages (louer,Prix, Superficie, Localisation); 
		garages.add(g0); 
	} 
	public static void ajoutercommerces(boolean louer,double Prix, double Superficie, String Localisation) { 
		Commerces c0 = new Commerces (louer,Prix, Superficie, Localisation); 
		commerces.add(c0); 
	} 
	
	public static void sauverParcImmobilier () throws IOException { 
		try { 

			File txt = new File("C:\\\\Users\\\\Maëlys Fourreau\\\\Documents\\\\Cours L1\\\\Algo\\\\Save.txt");
			txt.createNewFile();
			FileWriter ffw=new FileWriter(txt);	
			for (int k=0; k<parcimmobilier.size(); k++) { 	
				ParcImmobilier p0 = parcimmobilier.get(k); 
				ffw.write("\n\r"+parcimmobilier.get(k).toString()+"\n\r");
			} 
			ffw.close(); 
		} catch (FileNotFoundException e) { 
			e.printStackTrace(); 
		} 
	}


	public static void exitMenu() {
		System.out.println("Appuyez sur une touche pour sortir...");
		Scanner sc= new Scanner(System.in);
		String vide = sc.nextLine();
		if (!vide.equals(null)) {
			menu();
		}
	}

	public void chargerParcImmobilier (String Immo) { 
		try { 
			File f = new File (Immo); 
			Scanner parcimmo = new Scanner(f); 
			while (parcimmo.hasNext()) { 
				parcimmobilier.add(null); 
			} 
			parcimmo.close();  
		} catch (FileNotFoundException e) { 
			System.out.println ("Erreur !"); 
			e.printStackTrace(); 
		} 
	}  

	private static void insert() {
		System.out.println("Inserer un nouveau bien ...");
		System.out.println("Quel type de bien :");
		Scanner clavier=new Scanner(System.in);
		String entree = clavier.nextLine();
		entree.toLowerCase();
		switch(entree) {
		case "immeubles":{
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierPrix.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			System.out.println("Nombre de pièces");
			Scanner clavierPieces=new Scanner(System.in);
			int nbpieces = clavierPieces.nextInt();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getSuperficie()+" "+ p0.getPrix() +" euro" +" "+ p0.getLocalisation()); 

			break;

		}
		case "garages":{
			System.out.println("Louer:");
			Scanner clavierLouer=new Scanner(System.in);
			boolean louer = clavierLouer.nextBoolean();
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ajoutergarages(louer,prix,superficie,localisation);
			Garages g0 = garages.get(garages.size()-1); 
			System.out.println("Vous avez ajouté : "+g0.getClass() +" "+g0.isLouer()+" "+ g0.getPrix() +" euro " +g0.getSuperficie()+" m² "+ g0.getLocalisation()); 


			break;

		}
		case "commerces":{
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getPrix() +" euro " +p0.getSuperficie()+" m² "+ p0.getLocalisation()); 



			break;

		}
		case "terrains":{

			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getPrix() +" euro " +p0.getSuperficie()+" m² "+ p0.getLocalisation()); 

			break;

		}
		case "bureaux":{
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getPrix() +" euro " +p0.getSuperficie()+" m² "+ p0.getLocalisation()); 
			break;

		}
		case "maisons":{
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getPrix() +" euro " +p0.getSuperficie()+" m² "+ p0.getLocalisation()); 
			break;

		}
		case "appartements":{
			System.out.println("Prix:");
			Scanner clavierPrix=new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Superficie:");
			Scanner clavierSuperficie=new Scanner(System.in);
			double superficie = clavierSuperficie.nextInt();
			System.out.println("Localisation:");
			Scanner clavierLocalisation=new Scanner(System.in);
			String localisation = clavierLocalisation.nextLine();
			ajouterparcimmobilier(prix, superficie,localisation);
			ParcImmobilier p0 = parcimmobilier.get(parcimmobilier.size()-1); 
			System.out.println("Vous avez ajouté : "+p0.getClass() +" "+ p0.getPrix() +" euro " +p0.getSuperficie()+" m² "+ p0.getLocalisation()); 
			break;

		}

		default :
		break;
		}
		exitMenu();


	}

	private static void remove() {
		for (int i= 0; i<parcimmobilier.size(); i++) {
			ParcImmobilier p0 = parcimmobilier.get(i);
			System.out.println(i+" "+p0.getClass() +" "+ p0.getPrix() +" euro" +" "+ p0.getLocalisation()); 	
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		ParcImmobilier p0 = parcimmobilier.get(choix);
		System.out.println("Voulez vous supprimer :"+choix+" "+p0.getClass() +" "+ p0.getPrix() +" euro "+ p0.getLocalisation()+"  0: oui / 1: non"); 
		Scanner clavierConfirm = new Scanner(System.in);
		int confirm = clavierConfirm.nextInt();
		if (confirm== 0) {
			System.out.println("Bien N° "+choix+ " supprimé. \n");
			parcimmobilier.remove(choix);

		}

		for (int i= 0; i<parcimmobilier.size(); i++) {
			ParcImmobilier p1 = parcimmobilier.get(i);
			System.out.println(i+" "+p1.getClass() +" "+ p1.getPrix() +" euro "+ p1.getLocalisation()); 

		}
		exitMenu();
	}

	private static void choose() {
		for (int i= 1; i<parcimmobilier.size(); i++) {
			ParcImmobilier p0 = parcimmobilier.get(i);
			System.out.println(i+" "+p0.getClass() +" "+ p0.getPrix() +" euro "+ p0.getLocalisation()); 	
		}
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		ParcImmobilier p0 = parcimmobilier.get(choix);
		System.out.println(parcimmobilier.get(choix).toString()+"/n");
		System.out.println("Changer le prix du bien ? 0: Oui / 1: Non");
		Scanner clavierConfirm = new Scanner(System.in);
		int confirm = clavierConfirm.nextInt();
		if (confirm== 0) {
			System.out.println("Indiquez le nouveau prix :");
			Scanner clavierPrix = new Scanner(System.in);
			double prix = clavierPrix.nextInt();
			System.out.println("Le nouveau prix de "+p0.getClass() +" "+ p0.getPrix() +" euro "+ p0.getLocalisation()+" est de: "+prix);
		}
//2sec

		exitMenu();
	}






	public static void menu () {

		System.out.println("1: Inserer des biens \n" + "2: Supprimer des biens\n" + "3: Choisir un bien");
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		switch (choix) {
		case 1:{
			insert();
			break;
		}
		case 2:{
			remove();
			break;
		}
		case 3:{
			choose();
			break;
		}

		}

	}

	public static void main (String []args) throws IOException{   

		  
        Maisons m1 = new Maisons(false, 165000, 130, "97 Route Cantenay-Epinard, 49100 Angers", 6, 1, true, 1500); 
       m1.setLouer(m1.isLouer()); 
       System.out.println(m1); 
       m1.setNbgarages(m1.getNbgarages()); 
       m1.setExterieur(m1.isExterieur()); 
       Maisons m2 = new Maisons(false, 250000, 180, "283 Route d'Angers La Meignanne, 49770 Longuenée en Anjou", 10, 2, true, 3000); 
       m2.setLouer(m2.isLouer()); 
       System.out.println(m2); 
       m2.setNbgarages(m2.getNbgarages()); 
       m2.setExterieur(m2.isExterieur()); 
       Maisons m3 = new Maisons(true, 1000, 150, "14 Rue des Ponts de Cé, 49000 Angers", 8, 1, true, 2000); 
       m3.setLouer(m3.isLouer());  
       System.out.println(m3); 
       m3.setNbgarages(m3.getNbgarages()); 
       m3.setExterieur(m3.isExterieur()); 
       Maisons m4 = new Maisons(true, 1100, 150, "12 Rue Thiers, 49100 Angers ", 8, 0, false, 0); 
       m4.setLouer(m4.isLouer());
       System.out.println(m4); 
       m4.setNbgarages(m4.getNbgarages()); 
       m4.setExterieur(m4.isExterieur()); 
 
       ArrayList<Maisons> maisons = new ArrayList<Maisons>(); 
       maisons.add(m1); 
       maisons.add(m2); 
       maisons.add(m3); 
       maisons.add(m4); 
 
       Appartements a1 = new Appartements(160000, 80, "1 Rue Grand Pin, 49070 Beaucouzé", 6, false, 1, true, 45, 1, 2); 
       a1.setLouer(a1.isLouer()); 
       System.out.println(a1); 
       a1.setExterieur(a1.isExterieur()); 
       a1.setPlparking(a1.getPlparking()); 
       a1.setPlgarages(a1.getPlgarages()); 
       Appartements a2 = new Appartements(700, 100, "10 Rue Millet, 49100 Angers", 7, true, 1, false, 0, 0, 4); 
       a2.setLouer(a2.isLouer()); 
       System.out.println(a2); 
       a2.setExterieur(a2.isExterieur()); 
       a2.setPlparking(a2.getPlparking()); 
       a2.setPlgarages(a2.getPlgarages()); 
       Appartements a3 = new Appartements(190000, 85, "21 Rue Saumuroise, 49000 Angers", 5, false, 0, false, 0, 1, 3); 
       a3.setLouer(a3.isLouer()); 
       System.out.println(a3); 
       a3.setExterieur(a3.isExterieur()); 
       a3.setPlparking(a3.getPlparking()); 
       a3.setPlgarages(a3.getPlgarages()); 
       Appartements a4 = new Appartements(400, 50, "71 Grand Rue, 49610 Juigné Sur Loire", 5, true, 1, true, 20, 0, 6); 
       a4.setLouer(a4.isLouer()); 
       System.out.println(a4); 
       a4.setExterieur(a4.isExterieur()); 
       a4.setPlparking(a4.getPlparking()); 
       a4.setPlgarages(a4.getPlgarages()); 
 
       ArrayList<Appartements> appartements = new ArrayList<Appartements>(); 
       appartements.add(a1); 
       appartements.add(a2); 
       appartements.add(a3); 
       appartements.add(a4); 
 
       Bureaux b1 = new Bureaux(true, 799, 16, "6 Rue Roger Chauviré, 49125 Briollay", 1); 
       b1.setLouer(b1.isLouer()); 
       System.out.println(b1); 
       Bureaux b2 = new Bureaux(false, 19000, 23, "5 Chemin de Bellevue, 49610 Murs-Erignée", 2); 
       b2.setLouer(b2.isLouer()); 
       System.out.println(b2); 
       Bureaux b3 = new Bureaux(false, 21889, 28, "54 Avenue de La République, 49800 Trélazé", 3); 
       b3.setLouer(b3.isLouer()); 
       System.out.println(b3); 
       Bureaux b4 = new Bureaux(true, 367, 13, "189 Rue Belfort, 49100 Angers", 4); 
       b4.setLouer(b4.isLouer()); 
       System.out.println(b4); 

       ArrayList<Bureaux> bureaux = new ArrayList<Bureaux>(); 
       bureaux.add(b1); 
       bureaux.add(b2); 
       bureaux.add(b3); 
       bureaux.add(b4); 

 
       Commerces c1 = new Commerces(false, 157000, 64, "33 Rue Lenepveu, 49100 Angers"); 
       c1.setLouer(c1.isLouer()); 
       System.out.println(c1); 
       Commerces c2 = new Commerces(false, 35000, 35, "25 Rue Saint Laud, 49100 Angers"); 
       c2.setLouer(c2.isLouer()); 
       System.out.println(c2); 
       Commerces c3 = new Commerces(true, 1035, 23, "5bis Ecoparc du Buisson, 49073 Beaucouzé"); 
       c3.setLouer(c3.isLouer()); 
       System.out.println(c3); 
       Commerces c4 = new Commerces(true, 367, 13, "18 Parc de la Haye, 49240 Avrillée"); 
       c4.setLouer(c4.isLouer()); 
       System.out.println(c4); 

       ArrayList<Commerces> commerces = new ArrayList<Commerces>(); 
       commerces.add(c1); 
       commerces.add(c2); 
       commerces.add(c3); 
       commerces.add(c4); 

 
       Terrains t1 = new Terrains(false, 17930, 874, "10 Rue des Chataigniers, 49070 Saint Jean de Linières"); 
       t1.setLouer(t1.isLouer()); 
       System.out.println(t1); 
       Terrains t2 = new Terrains(true, 890, 530, "47 Rue du Stade, 49370 Saint Clément de la Place"); 
       t2.setLouer(t2.isLouer()); 
       System.out.println(t2); 
       Terrains t3 = new Terrains(true, 655, 291, "29 Rue du Parc La Poueze, 49220 Erdre en Anjou"); 
       t3.setLouer(t3.isLouer()); 
       System.out.println(t3); 
       Terrains t4 = new Terrains(false, 35000, 1262, "21 Rue de Bellebranche, 49000 Ecouflant"); 
       t4.setLouer(t4.isLouer()); 
       System.out.println(t4); 
       
       ArrayList<Terrains> terrains = new ArrayList<Terrains>(); 
       terrains.add(t1); 
       terrains.add(t2); 
       terrains.add(t3); 
       terrains.add(t4); 

       Garages g1 = new Garages(true, 799, 16, "23 Rue Barra, 49100 Angers"); 
       g1.setLouer(g1.isLouer()); 
       System.out.println(g1); 
       Garages g2 = new Garages(false, 19000, 23, "56 Rue Saint Jean, 49610 Murs-Erignée"); 
       g2.setLouer(g2.isLouer()); 
       System.out.println(g2); 
       Garages g3 = new Garages(false, 21889, 28, "13 Rue de La Fontaine La Meignanne, 49770 Longuenée en Anjou"); 
       g3.setLouer(g3.isLouer()); 
       System.out.println(g3); 
       Garages g4 = new Garages(true, 367, 13, "22 Rue de La Varie La Meignanne, 49770 Longuenée en Anjou"); 
       g4.setLouer(g4.isLouer()); 
       System.out.println(g4); 

       ArrayList<Garages> garages = new ArrayList<Garages>(); 
       garages.add(g1); 
       garages.add(g2); 
       garages.add(g3); 
       garages.add(g4); 

       Immeubles i1 = new Immeubles(true, 768000, 422, "10 Rue Millet, 49100 Angers", 3, 0, 18, 4, null,null); 
       i1.setLouer(i1.isLouer()); 
       System.out.println(i1); 
       i1.setGarages(i1.getGarages()); 
       i1.setParking(i1.getParking()); 
       i1.setEtages(i1.getEtages());
       Immeubles i2 = new Immeubles(false, 600099, 276, "54 Avenue de La République, 49800 Trélazé", 16, 4, 2, 3, null, null); 
       i2.setLouer(i2.isLouer()); 
       System.out.println(i2); 
       i2.setGarages(i2.getGarages()); 
       i2.setParking(i2.getParking()); 
       i2.setEtages(i2.getEtages());
       Immeubles i3 = new Immeubles(true, 804398, 499, "2 Avenue de La Guillebotte, 49130 Les Ponts de Cé", 20, 2, 13, 5, null, null); 
       i3.setLouer(i3.isLouer()); 
       System.out.println(i3); 
       i3.setGarages(i3.getGarages()); 
       i3.setParking(i3.getParking()); 
       i3.setEtages(i3.getEtages()); 
       Immeubles i4 = new Immeubles(false, 910000, 541, "71 Grand Rue, 49610 Juigné Sur Loire", 24, 7, 0, 6, null, null); 
       i4.setLouer(i4.isLouer()); 
       System.out.println(i4); 
       i4.setGarages(i4.getGarages()); 
       i4.setParking(i4.getParking());
       i4.setEtages(i4.getEtages()); 
 

       ArrayList<Immeubles> immeubles = new ArrayList<Immeubles>(); 
       immeubles.add(i1); 
       immeubles.add(i2); 
       immeubles.add(i3); 
       immeubles.add(i4); 

      // ImAppart(appartements, immeubles);
       //ImBur(bureaux, immeubles); 

    


		ParcImmobilier pm1 = new Maisons(false, 165000, 130, "97 Route Cantenay-Epinard, 49100 Angers", 6, 1, true, 1500); 
		ParcImmobilier pm2=new Maisons(false, 250000, 180, "283 Route d'Angers La Meignanne, 49770 Longuenée en Anjou", 10, 2, true, 3000);
		ParcImmobilier pm3= new Maisons(true, 1000, 150, "14 Rue des Ponts de Cé, 49000 Angers", 8, 1, true, 2000);
		ParcImmobilier pm4=new Maisons(true, 1100, 150, "12 Rue Thiers, 49100 Angers ", 8, 0, false, 0); 
		ParcImmobilier pa1= new Appartements(160000, 80, "1 Rue Grand Pin, 49070 Beaucouzé", 6, false, 1, true, 45, 1, 2);
		ParcImmobilier pa2= new Appartements(700, 100, "10 Rue Millet, 49100 Angers", 7, true, 1, false, 0, 0, 4);
		ParcImmobilier pa3 = new Appartements(190000, 85, "21 Rue Saumuroise, 49000 Angers", 5, false, 0, false, 0, 1, 3);
		ParcImmobilier pa4= new Appartements(400, 50, "71 Grand Rue, 49610 Juigné Sur Loire", 5, true, 1, true, 20, 0, 6); 
		ParcImmobilier pb1 =new Bureaux(true, 799, 16, "6 Rue Roger Chauviré, 49125 Briollay", 1); 
		ParcImmobilier pb2=  new Bureaux(false, 19000, 23, "5 Chemin de Bellevue, 49610 Murs-Erignée", 2);
		ParcImmobilier pb3= new Bureaux(false, 21889, 28, "54 Avenue de La République, 49800 Trélazé", 3); 
		ParcImmobilier pb4=new Bureaux(true, 367, 13, "189 Rue Belfort, 49100 Angers", 4); 
		ParcImmobilier pc1=new Commerces(false, 157000, 64, "33 Rue Lenepveu, 49100 Angers"); 
		ParcImmobilier pc2 = new Commerces(false, 35000, 35, "25 Rue Saint Laud, 49100 Angers");
		ParcImmobilier pc3 =new Commerces(true, 1035, 23, "5bis Ecoparc du Buisson, 49073 Beaucouzé");
		ParcImmobilier pc4= new Commerces(true, 367, 13, "18 Parc de la Haye, 49240 Avrillée"); 
		ParcImmobilier pt1=new Terrains(false, 17930, 874, "10 Rue des Chataigniers, 49070 Saint Jean de Linières"); 
		ParcImmobilier pt2 = new Terrains(true, 890, 530, "47 Rue du Stade, 49370 Saint Clément de la Place"); 
		ParcImmobilier pt3= new Terrains(true, 655, 291, "29 Rue du Parc La Poueze, 49220 Erdre en Anjou");
		ParcImmobilier pt4= new Terrains(false, 35000, 1262, "21 Rue de Bellebranche, 49000 Ecouflant"); 
		ParcImmobilier pg1= new Garages(true, 799, 16, "23 Rue Barra, 49100 Angers"); 
		ParcImmobilier pg2 = new Garages(false, 19000, 23, "56 Rue Saint Jean, 49610 Murs-Erignée"); 
		ParcImmobilier pg3 =new Garages(false, 21889, 28, "13 Rue de La Fontaine La Meignanne, 49770 Longuenée en Anjou"); 
		ParcImmobilier pg4 = new Garages(true, 367, 13, "22 Rue de La Varie La Meignanne, 49770 Longuenée en Anjou"); 
		ParcImmobilier pi1= new Immeubles(true, 768000, 422, "10 Rue Millet, 49100 Angers", 3, 0, 18, 4, null,null); 
		ParcImmobilier pi2 = new Immeubles(false, 600099, 276, "54 Avenue de La République, 49800 Trélazé", 16, 4, 2, 3, null, null);
		ParcImmobilier pi3 = new Immeubles(true, 804398, 499, "2 Avenue de La Guillebotte, 49130 Les Ponts de Cé", 20, 2, 13, 5, null, null); 
		ParcImmobilier pi4 = new Immeubles(false, 910000, 541, "71 Grand Rue, 49610 Juigné Sur Loire", 24, 7, 0, 6, null, null); 

		parcimmobilier.add(pm1);
		parcimmobilier.add(pm2);
		parcimmobilier.add(pm3);
		parcimmobilier.add(pm4);
		parcimmobilier.add(pa1);
		parcimmobilier.add(pa2);
		parcimmobilier.add(pa3);
		parcimmobilier.add(pa4);
		parcimmobilier.add(pb1);
		parcimmobilier.add(pb2);
		parcimmobilier.add(pb3);
		parcimmobilier.add(pb4);
		parcimmobilier.add(pc1);
		parcimmobilier.add(pc2);
		parcimmobilier.add(pc3);
		parcimmobilier.add(pc4);
		parcimmobilier.add(pt1);
		parcimmobilier.add(pt2);
		parcimmobilier.add(pt3);
		parcimmobilier.add(pt4);
		parcimmobilier.add(pg1);
		parcimmobilier.add(pg2);
		parcimmobilier.add(pg3);
		parcimmobilier.add(pg4);
		parcimmobilier.add(pi1);
		parcimmobilier.add(pi2);
		parcimmobilier.add(pi3);
		parcimmobilier.add(pi4);
		sauverParcImmobilier();
		menu();



	}
}