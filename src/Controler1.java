
public class Controler1 implements Controler
{
	private Model model;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	    public Controler1 (Model model) {
	        this.model = model;
	    }
	    
	    public void schalteZustand() {
	        
	        if (model.getZustand() == 1) {
	            model.setZustand(0);
	        } else {
	            model.setZustand(1);
	        }
	    }
	}

}
