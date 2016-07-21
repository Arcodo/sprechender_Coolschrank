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
	        setVisible(true);
	        getContentPane().add(kästen);
	        model = m;
	        controler = new Controler1(model);
	       //Anfang
	    
    JButton1.setText("Button1");
    JButton1.addActionListener(this);
    kästen.add(JButton1);
    
    JButton2.setText("Button2");
    JButton2.addActionListener(this);
    kästen.add(JButton2);
    //addEingabePanel();
    
     
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
	        
	        kästen = new JToolBar();
	        kästen.add(AusgabePanel);
	        JButton1 = new JButton("Milch nehmen");
	        JButton2 = new JButton("Butter nehmen");
            JButton3 = new JButton ("Käse nehmen");
            JButton3 = new JButton ("Joghurt nehmen");
            AusgabeLabel = new JLabel ("Bestand:"
            		+ model.getProduktzahl(1) + "Milch");
            AusgabeLabel.setLocation(690, 100);
            AusgabePanel = new JPanel();
            kästen.add(AusgabePanel);
            AusgabePanel.setLocation(683, 0);
            AusgabePanel.setSize(317, 218);
            AusgabePanel.add(JButton1);
            JButton1.setLocation(0, 0);
            AusgabePanel.add(JButton2);
            AusgabePanel.add(JButton3);
            AusgabePanel.add(JButton4);
            AusgabePanel.add(AusgabeLabel);
            AusgabePanel.setVisible(true);
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

