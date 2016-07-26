import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class View_Graphic1 extends JFrame implements Beobachter, ActionListener
{
    
    private Model model;
    private Controler1 controler;
    private JToolBar kästen;
    private JButton JButton1;
    private JButton JButton2;
    private JButton JButton3;
    private JButton JButton4;
    private JLabel Bild;
    private JLabel AusgabeLabel;
    
     
	    /** erzeugt ein Graphikfenster */
    public View_Graphic1(Model m) {
	        super("Graphic1");
	        setBounds(100, 0, 1200, 1000);
	        setVisible(true);
	        
	        model = m;
	        
	        JButton1 = new JButton("Milch nehmen");
	        JButton1.setBounds(700, 20, 200, 60);
	        
	        JButton2 = new JButton("Butter nehmen");
	        JButton2.setBounds(950, 20, 200, 60);
	        
            JButton3 = new JButton ("Käse nehmen");
            JButton3.setBounds(700, 100, 200, 60);
	        
           
            JButton4 = new JButton ("Joghurt nehmen");
            JButton4.setBounds(950, 100, 200, 60);
            
            
            AusgabeLabel = new JLabel ("AAAAAUUUUUUSSSSSGGGGAAAABBBEEEE");
            AusgabeLabel.setBounds(700, 160, 300, 400);
           
            getContentPane().add(JButton1);
            getContentPane().add(JButton2);
            getContentPane().add(JButton3);
            getContentPane().add(JButton4);
            getContentPane().add(AusgabeLabel);
            
 }

public void actionPerformed (ActionEvent event)
{
    String cmd = event.getActionCommand();
    controler.ProduktNehmen(cmd);
    this.repaint();
}
    
    //Schluss
	    
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
	    
	    public void setControler(Controler1 c){
	    	controler = c;
	    }
	}

