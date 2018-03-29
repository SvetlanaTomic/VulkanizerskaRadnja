package gume;

/**
 * 
 * Klasa AutoGuma sadrzi promenjive precnik, sirina, visina, odgovarajuce get i
 * set metode, kao i redeinisane equals i toString metode
 * 
 * @author SvetlanaTomic
 * @version 1.0
 *
 */
public class AutoGuma {
	
	
	/**
	 * atribut koji prikazuje marku i model gume
	 */
	private String markaModel = null;
	/**
	 * atribut koji prikazuje precnik gume
	 */
	private int precnik = 0;
	/**
	 * atribut koji prikazuje sirinu gume
	 */
	private int sirina = 0;
	
	/**
	 * atribut koji prikazuje visinu gume
	 */
	private int visina = 0;

	/**
	 * metoda koja vraca marku i model gume
	 * 
	 * @return marku i model gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * metoda kojom se postavlja marka, odnosno model gume
	 * 
	 * @param markaModel
	 *            marka i model gume
	 * @throws java.lang.RuntimeException
	 *             ako je marka null ili ako je duzina reci manja od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * metoda koja vraca precnik gume
	 * 
	 * @return precnik
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * metoda kojom se postavlja precnik gume
	 * 
	 * @param precnik
	 *            precnik gume
	 * @throws java.lang.RuntimeException
	 *             ako je precnik gume manji od 13 i veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * metoda koja vraca sirinu gume
	 * 
	 * @return sirina
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * metoda kojom se postavlja sirina gume
	 * 
	 * @param sirina
	 *            sirina gume
	 * @throws java.lang.RuntimeException
	 *             ako je sirina gume manja od 135 i veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * metoda koja vraca visinu gume
	 * 
	 * @return visina
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * metoda kojom se postavlja visina gume
	 * 
	 * @param visina
	 *            visina gume
	 * @throws java.lang.RuntimeException
	 *             ako je visina gume manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * metoda koja override toString metodu, da zadovolji potrebe ove klase
	 * 
	 * @return string svih atributa
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * metoda koja poredi dva objekta klase AutoGuma, tacnije sve njihove atribute
	 * 
	 * @return
	 *         <ul>
	 *         <li>true, ako su svi atributi medjusobno jednaki</li>
	 *         <li>false, ako nisu svi jednaki</li>
	 *         </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
