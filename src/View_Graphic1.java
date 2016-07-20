import javax.swing.*;
import java.awt.*;
public class View_Graphic1 extends JFrame implements Beobachter
{
    
    private Model model;
     
	    /** erzeugt ein Graphikfenster */
    public View_Graphic1() {
	        super("Graphic1");
	        setBounds(100, 100, 1000, 1500);;
	        setVisible(true);
	    }
	    
	    /** überschreibt die paint-Methode der JFrame-Klasse, um das Bild des Kühlschranks auszugeben
	     */
	    public void paint(Graphics g) {
	       super.paint(g);
	       Image coolschrank = new ImageIcon(this.getClass().getResource("/Coolschrank.jpg")).getImage();
	        g.drawImage(coolschrank, 10, 10, 683, 982, this);
	       
	    }
	    
	    /** speichert die Referenz auf das aktuelle Model und fordert das Neuzeichnen des Fensters an*/
	    public void update(Model model) {
	        this.model = model;
	        repaint();
	    }
	}

