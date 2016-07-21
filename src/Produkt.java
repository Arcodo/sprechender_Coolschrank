public class Produkt {
	private int maxAnzahl;
	private String name;
	private int menge;
	
	public Produkt(int maxAnzahlNeu, String neuerName, int neueMenge)
	{
		maxAnzahl = maxAnzahlNeu;
		name = neuerName;
		menge = neueMenge;
	}
	
	public String nameAusgeben()
	{
		return name;
	}
	
	public int mengeAusgeben()
	{
		return menge;
	}
	
	public int einkaufsMengeBerechnen()
	{
		return maxAnzahl - menge;
	}
	
	public void EinsEntfernen(){
		menge = menge - 1;
	}
	
}