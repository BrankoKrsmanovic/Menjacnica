package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;

public interface IMenjacnica {

	public void dodajKurs(String naziv, GregorianCalendar datum, Kurs kurs);
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	public Kurs vratiKurs(String naziv, GregorianCalendar datum);
}
