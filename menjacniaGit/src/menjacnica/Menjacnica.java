package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.IMenjacnica;
import valuta.Kurs;
import valuta.Valuta;

public class Menjacnica implements IMenjacnica {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, GregorianCalendar datum, Kurs kurs) {

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum))
				valute.get(i).setKurs(kurs);
			else {
				Valuta pom = new Valuta();
				pom.setNaziv(naziv);
				pom.setSkraceno(naziv.substring(0, 3));
				pom.setDatum(datum);
				pom.setKurs(kurs);

				valute.add(pom);
			}
		}

	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {

		boolean obrisan = false;

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				valute.remove(valute.get(i));
				obrisan = true;
			}
		}

		if (!obrisan)
			System.out.println("Dati kurs ne postoji u listi");
	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar datum) {

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum))
				return valute.get(i).getKurs();
		}

		System.out.println("Dati kurs ne postoji u listi");
		return null;
	}

}
