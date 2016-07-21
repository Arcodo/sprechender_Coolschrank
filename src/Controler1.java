
public class Controler1 implements Controler
{
	private Model model;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	    public Controler1 (Model model) {
	        this.model = model;
	    }
	    
	    public void ProduktNehmen(String s) {
	    	if (s.equals("Milch nehmen"))
	        {
	            model.ProduktEntfernen(0);
	        }
	    	if (s.equals("Butter nehmen"))
	        {
	            model.ProduktEntfernen(1);
	        }
	    	if (s.equals("Käse nehmen"))
	        {
	            model.ProduktEntfernen(2);
	        }
	    	else if (s.equals("Joghurt nehmen"))
	        {
	            model.ProduktEntfernen(3);
	        }
	        }
	    
	}


