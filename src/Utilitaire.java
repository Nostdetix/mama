import java.util.ArrayList;

public class Utilitaire {
	public static ArrayList<Maison> creerMaisons() {
		Maison m1 = new Maison(165000, 130, "97 Route Cantenay-Epinard, 49100 Angers", false, 6, 1, true, 1500);
		m1.setLouer(m1.isLouer());
		System.out.println(m1);
		m1.setNbgarages(m1.getNbgarages());
		m1.setExterieur(m1.isExterieur());

		Maison m2 = new Maison(250000, 180, "283 Route d'Angers La Meignanne, 49770 Longuenée en Anjou", false, 10, 2, true, 3000);
		m2.setLouer(m2.isLouer());
		System.out.println(m2);
		m2.setNbgarages(m2.getNbgarages());
		m2.setExterieur(m2.isExterieur());

		Maison m3 = new Maison(1000, 150, "14 Rue des Ponts de Cé, 49000 Angers", true, 8, 1, true, 2000);
		m3.setLouer(m3.isLouer());
		System.out.println(m3);
		m3.setNbgarages(m3.getNbgarages());
		m3.setExterieur(m3.isExterieur());

		Maison m4 = new Maison(1100, 150, "12 Rue Thiers, 49100 Angers ", true, 8, 0, false, 0);
		m4.setLouer(m4.isLouer());
		System.out.println(m4);
		m4.setNbgarages(m4.getNbgarages());
		m4.setExterieur(m4.isExterieur());

		ArrayList<Maison> maisons = new ArrayList<>();
		maisons.add(m1);
		maisons.add(m2);
		maisons.add(m3);
		maisons.add(m4);

		return maisons;
	}

	public static ArrayList<Appartement> creerAppartements() {
		Appartement a1 = new Appartement(160000, 80, "1 Rue Grand Pin, 49070 Beaucouzé", false, 6, 1, true, 45, 1, 2);
		a1.setLouer(a1.isLouer());
		System.out.println(a1);
		a1.setExterieur(a1.isExterieur());
		a1.setPlparking(a1.getPlparking());
		a1.setPlgarages(a1.getPlgarages());

		Appartement a2 = new Appartement(700, 100, "10 Rue Millet, 49100 Angers", true, 7, 1, false, 0, 0, 4);
		a2.setLouer(a2.isLouer());
		System.out.println(a2);
		a2.setExterieur(a2.isExterieur());
		a2.setPlparking(a2.getPlparking());
		a2.setPlgarages(a2.getPlgarages());

		Appartement a3 = new Appartement(190000, 85, "21 Rue Saumuroise, 49000 Angers", false, 5, 0, false, 0, 1, 3);
		a3.setLouer(a3.isLouer());
		System.out.println(a3);
		a3.setExterieur(a3.isExterieur());
		a3.setPlparking(a3.getPlparking());
		a3.setPlgarages(a3.getPlgarages());

		Appartement a4 = new Appartement(400, 50, "71 Grand Rue, 49610 Juigné Sur Loire", true, 5, 1, true, 20, 0, 6);
		a4.setLouer(a4.isLouer());
		System.out.println(a4);
		a4.setExterieur(a4.isExterieur());
		a4.setPlparking(a4.getPlparking());
		a4.setPlgarages(a4.getPlgarages());

		ArrayList<Appartement> appartements = new ArrayList<>();
		appartements.add(a1);
		appartements.add(a2);
		appartements.add(a3);
		appartements.add(a4);

		return appartements;
	}

	public static ArrayList<Bureau> creerBureaux() {
		Bureau b1 = new Bureau(799, 16, "6 Rue Roger Chauviré, 49125 Briollay", true, 1);
		b1.setLouer(b1.isLouer());
		System.out.println(b1);

		Bureau b2 = new Bureau(19000, 23, "5 Chemin de Bellevue, 49610 Murs-Erignée", false, 2);
		b2.setLouer(b2.isLouer());
		System.out.println(b2);

		Bureau b3 = new Bureau(21889, 28, "54 Avenue de La République, 49800 Trélazé", false, 3);
		b3.setLouer(b3.isLouer());
		System.out.println(b3);

		Bureau b4 = new Bureau(367, 13, "189 Rue Belfort, 49100 Angers", true, 4);
		b4.setLouer(b4.isLouer());
		System.out.println(b4);

		ArrayList<Bureau> bureaux = new ArrayList<>();
		bureaux.add(b1);
		bureaux.add(b2);
		bureaux.add(b3);
		bureaux.add(b4);

		return bureaux;
	}

	public static ArrayList<Commerce> creerCommerces() {
		Commerce c1 = new Commerce(157000, 64, "33 Rue Lenepveu, 49100 Angers", false);
		c1.setLouer(c1.isLouer());
		System.out.println(c1);

		Commerce c2 = new Commerce(35000, 35, "25 Rue Saint Laud, 49100 Angers", false);
		c2.setLouer(c2.isLouer());
		System.out.println(c2);

		Commerce c3 = new Commerce(1035, 23, "5bis Ecoparc du Buisson, 49073 Beaucouzé", true);
		c3.setLouer(c3.isLouer());
		System.out.println(c3);

		Commerce c4 = new Commerce(367, 13, "18 Parc de la Haye, 49240 Avrillée", true);
		c4.setLouer(c4.isLouer());
		System.out.println(c4);

		ArrayList<Commerce> commerces = new ArrayList<>();
		commerces.add(c1);
		commerces.add(c2);
		commerces.add(c3);
		commerces.add(c4);

		return commerces;
	}

	public static ArrayList<Terrain> creerTerrains() {
		Terrain t1 = new Terrain(17930, 874, "10 Rue des Chataigniers, 49070 Saint Jean de Linières", false);
		t1.setLouer(t1.isLouer());
		System.out.println(t1);

		Terrain t2 = new Terrain(890, 530, "47 Rue du Stade, 49370 Saint Clément de la Place", true);
		t2.setLouer(t2.isLouer());
		System.out.println(t2);

		Terrain t3 = new Terrain(655, 291, "29 Rue du Parc La Poueze, 49220 Erdre en Anjou", true);
		t3.setLouer(t3.isLouer());
		System.out.println(t3);

		Terrain t4 = new Terrain(35000, 1262, "21 Rue de Bellebranche, 49000 Ecouflant", false);
		t4.setLouer(t4.isLouer());
		System.out.println(t4);

		ArrayList<Terrain> terrains = new ArrayList<>();
		terrains.add(t1);
		terrains.add(t2);
		terrains.add(t3);
		terrains.add(t4);

		return terrains;
	}

	public static ArrayList<Garage> creerGarages() {
		Garage g1 = new Garage(799, 16, "23 Rue Barra, 49100 Angers", true);
		g1.setLouer(g1.isLouer());
		System.out.println(g1);

		Garage g2 = new Garage(19000, 23, "56 Rue Saint Jean, 49610 Murs-Erignée", false);
		g2.setLouer(g2.isLouer());
		System.out.println(g2);

		Garage g3 = new Garage(21889, 28, "13 Rue de La Fontaine La Meignanne, 49770 Longuenée en Anjou", false);
		g3.setLouer(g3.isLouer());
		System.out.println(g3);

		Garage g4 = new Garage(367, 13, "22 Rue de La Varie La Meignanne, 49770 Longuenée en Anjou", true);
		g4.setLouer(g4.isLouer());
		System.out.println(g4);

		ArrayList<Garage> garages = new ArrayList<>();
		garages.add(g1);
		garages.add(g2);
		garages.add(g3);
		garages.add(g4);

		return garages;
	}

	public static ArrayList<Immeuble> creerImmeubles() {
		Immeuble i1 = new Immeuble(768000, 422, "10 Rue Millet, 49100 Angers", true, 3, 0, 18, 4, null, null);
		i1.setLouer(i1.isLouer());
		System.out.println(i1);
		i1.setGarages(i1.getGarages());
		i1.setParking(i1.getParking());
		i1.setEtages(i1.getEtages());

		Immeuble i2 = new Immeuble(600099, 276, "54 Avenue de La République, 49800 Trélazé", false, 16, 4, 2, 3, null, null);
		i2.setLouer(i2.isLouer());
		System.out.println(i2);
		i2.setGarages(i2.getGarages());
		i2.setParking(i2.getParking());
		i2.setEtages(i2.getEtages());

		Immeuble i3 = new Immeuble(804398, 499, "2 Avenue de La Guillebotte, 49130 Les Ponts de Cé", true, 20, 2, 13, 5, null, null);
		i3.setLouer(i3.isLouer());
		System.out.println(i3);
		i3.setGarages(i3.getGarages());
		i3.setParking(i3.getParking());
		i3.setEtages(i3.getEtages());

		Immeuble i4 = new Immeuble(910000, 541, "71 Grand Rue, 49610 Juigné Sur Loire", false, 24, 7, 0, 6, null, null);
		i4.setLouer(i4.isLouer());
		System.out.println(i4);
		i4.setGarages(i4.getGarages());
		i4.setParking(i4.getParking());
		i4.setEtages(i4.getEtages());

		ArrayList<Immeuble> immeubles = new ArrayList<>();
		immeubles.add(i1);
		immeubles.add(i2);
		immeubles.add(i3);
		immeubles.add(i4);

		return immeubles;
	}
}
