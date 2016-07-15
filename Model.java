import java.util.ArrayList;

public class Model{
    //Daten, die das Model hält
    private Produkt[] produkte;
    
    //Beobachter (Views), die das Model hält
    private ArrayList<Beobachter> beobachter;
    
    /** erzeugt ein Objekt der Klasse Model */
    public Model() {
        produkte = new Produkt[3];
        produkteEinfuegen();
        beobachter = new ArrayList<Beobachter>();
    }
            
    public void produkteEinfuegen()
    {
    	produkte[0] = new Produkt(5, "Milch", 5);
    	produkte[1] = new Produkt(5, "Butter", 5);
    	produkte[2] = new Produkt(5, "Käse", 5);
    	produkte[3] = new Produkt(5, "Joghurt", 5);
    }
    /** ruft von allen Beobachtern die Methode update() auf. Die Existenz dieser Methode ist 
     * durch die Schnittstelle garantiert.
     */
    public void BeobachterBenachrichtigen() {
        
        for (int i = 0; i < beobachter.size(); i++) {
            beobachter.get(i).update(this);
        }
    }
    
    /** fügt einen Beobachter hinzu */
    public void BeobachterHinzufuegen(Beobachter b) {
         beobachter.add(b);
    }
    
    /** entfernt einen Beobachter */
     public void BeobachterEntfernen(Beobachter b) {
         beobachter.remove(b);
    }
}