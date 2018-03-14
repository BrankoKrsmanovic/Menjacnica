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
		if(naziv == null || naziv.equals(""))
			throw new RuntimeException("ERROR: Nedozvoljen unos!");
		this.naziv = naziv;
	}

	public String getSkraceno() {
		return skraceno;
	}

	public void setSkraceno(String skraceno) {
		if(skraceno == null || skraceno.equals(""))
			throw new RuntimeException("ERROR: Nedozvoljen unos!");
		this.skraceno = skraceno;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum == null)
			throw new RuntimeException("ERROR: Nedozvoljen unos!");
		this.datum = datum;
	}

	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		if(kurs == null)
			throw new RuntimeException("ERROR: Nedozvoljen unos!");
		this.kurs = kurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceno == null) ? 0 : skraceno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceno == null) {
			if (other.skraceno != null)
				return false;
		} else if (!skraceno.equals(other.skraceno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceno=" + skraceno + ", datum=" + datum + ", kurs=" + kurs + "]";
	}

	
}
