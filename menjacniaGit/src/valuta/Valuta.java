package valuta;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceno;
	private GregorianCalendar datum;
	private Kurs kurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceno() {
		return skraceno;
	}

	public void setSkraceno(String skraceno) {
		this.skraceno = skraceno;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}

}
