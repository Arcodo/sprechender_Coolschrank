import java.util.ArrayList;

public class Model{
    //Daten, die das Model h�lt
    private Produkt[] produkte;
    
    //Beobachter (Views), die das Model h�lt
    private ArrayList<Beobachter> beobachter;
    
    
    /** erzeugt ein Objekt der Klasse Model */
    public void Model(){
        produkte = new Produkt[4];
        produkteEinfuegen();
        }
            
    public void produkteEinfuegen()
    {
    	produkte[0] = new Produkt(5, "Milch", 5);
    	produkte[1] = new Produkt(5, "Butter", 5);
    	produkte[2] = new Produkt(5, "K�se", 5);
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
    
    /** f�gt einen Beobachter hinzu */
    public void BeobachterHinzufuegen(Beobachter b) {
         beobachter.add(b);
    }
    
    /** entfernt einen Beobachter */
     public void BeobachterEntfernen(Beobachter b) {
         beobachter.remove(b);
    }
     
     public int getProduktzahl(int i){
    	 return produkte[i].mengeAusgeben();
     }
     
     public void ProduktEntfernen(int i){
    	 produkte[i].EinsEntfernen();
    	 this.BeobachterBenachrichtigen();
     }
     
     
}