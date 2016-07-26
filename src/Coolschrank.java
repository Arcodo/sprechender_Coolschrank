
public class Coolschrank {
	
	private static Model m;
	private static View_Graphic1 v;
	private static Controler1 c;

	public static void main(String[] args) {
		m = new Model();
		v = new View_Graphic1(m);
		m.BeobachterHinzufuegen(v);
		c = new Controler1(m);
		v.setControler(c);
	}

}
