package de.versicherung.logic;

public enum ZuVersicherndeTiere {
	HUND (
			new String [] {"Schäferhund", "Dackel", "Französische Bulldogge","Labrador", "Golden Retriever"},
			new String []{"Magendrehung", "Hauttumore", "Kreuzbandriss", "Grauer Star", "Ohrenentzündung"}
			), 
	KATZE (
			new String [] {"Hauskatze", "Main Coon", "Perser", "Siam", "British Kurzhaar"},
			new String [] {"Chronische Niereninsuffizienz", "Diabetis", "Katzenstaupe", "Katzenschnupfen", "Schilddrüsenüberfunktion"}
			), 
	PFERD(
			new String [] {"Hannoveraner", "Oldenburger", "Quarter Horse", "Island Pferd", "Pony"},
			new String [] {"Kolik", "Osteochondrosis", "Griffelbeinfraktur", "Equines Sarkoid", "Schnittverletzungen"}
			);
	
	private String rasse [];
	private String krankheiten [];
	
	ZuVersicherndeTiere(String [] rasse, String krankheiten[]) {
		this.rasse = rasse;
		this.krankheiten = krankheiten;
	}
}
