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
    private JLabel AusgabeLabel;
    private JPanel AusgabePanel;

     
	    /** erzeugt ein Graphikfenster */
    public View_Graphic1(Model m) {
	        super("Graphic1");
	        setBounds(100, 0, 1200, 1000);;
	        model = m;
	        
	        kästen = new JToolBar();
	        JButton1 = new JButton("Milch nehmen");
	        JButton1.setBounds(0, 0, 100, 100);
	        JButton1.setVisible(true);
	        
	        JButton2 = new JButton("Butter nehmen");
	        JButton2.setBounds(100, 0, 00, 100);
	        JButton2.setVisible(true);
	        
            JButton3 = new JButton ("Käse nehmen");
            JButton4 = new JButton ("Joghurt nehmen");
            AusgabeLabel = new JLabel ("Ausgabe");
            AusgabeLabel.setLocation(690, 100);
            
            AusgabePanel = new JPanel();
            AusgabePanel.setLocation(1000, 0);
            AusgabePanel.setSize(317, 218);
            AusgabePanel.add(JButton1);
            AusgabePanel.add(JButton2);
            AusgabePanel.add(JButton3);
            AusgabePanel.add(JButton4);
            AusgabePanel.add(AusgabeLabel);
            AusgabePanel.setVisible(true);
            
            getContentPane().add(kästen);
            getContentPane().add(AusgabePanel);
            
    kästen.add(JButton1);
    kästen.add(JButton2);
    
    setVisible(true);
    
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

