package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.IMenjacnica;
import valuta.Kurs;
import valuta.Valuta;

public class Menjacnica implements IMenjacnica{

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String naziv, GregorianCalendar datum, Kurs kurs) {

		boolean ubacen = false;
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				valute.get(i).setKurs(kurs);
				ubacen = true;
			}
			else {
				Valuta pom = new Valuta();
				pom.setNaziv(naziv);
				pom.setSkraceno(naziv.substring(0,3));
				pom.setDatum(datum);
				pom.setKurs(kurs);
				
				valute.add(pom);
				ubacen = true;
			}
		}
		
		if(!ubacen)
			throw new RuntimeException("ERROR: Kurs nije ubacen!");
	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
