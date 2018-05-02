package de.versicherung.logic;

public enum Krankheiten {

	
	MAGENDREHUNG("Katze"), 
	MAGENSCHMERZEN("Katze");
	
	
	private String typ;
	
	private Krankheiten(String typ) {
	
		this.typ = typ;
		
	}

	public String getTyp() {
		return typ;
	}	
}
