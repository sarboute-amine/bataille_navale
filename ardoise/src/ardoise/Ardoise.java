package ardoise;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

public class Ardoise extends JPanel {
    static final long serialVersionUID = 1;
    private boolean possedeDisque = true;
    public Ardoise() {
	setBackground(Color.YELLOW);
	setPreferredSize(new Dimension(200, 150));
    } 

    public void setPossedeDisque(boolean possedeDisque) {
	this.possedeDisque = possedeDisque;
    }
    
    public void dessiner(Graphics g) {
	g.setColor(Color.RED);	
	g.draw3DRect(20, 40, 200, 400, false);
   }
    
    public void deplacer(Graphics g) {
    	
    }
    
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	if (possedeDisque) dessiner(g);
    }
}

class VoirFenetre {
    public static void main(String[] arg) {	
	JFrame cadre = new JFrame("Un disque");
	cadre.setContentPane(new Ardoise());
	cadre.setLocation(400, 300);
	cadre.pack();
	cadre.setVisible(true);
	cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
