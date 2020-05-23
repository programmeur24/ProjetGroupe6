package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import model.IInsanePersonModel;
import model.InsanePersonModel;
import model.Road;

public class ViewFrame extends JFrame implements IIsanePersonView  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7210917015153809032L;
	//****ATTRIBUTS****//
	private static InsanePersonView scene;
	private IInsanePersonModel modele;
	private static  Road road;
	private int niveau;
	private int i = 0;
	
	
	
	//****CONSTRUCTOR****//
	public ViewFrame(int i) throws Exception {
		this.niveau = i;
		ViewFrame.road = null;
		afficher();
		Thread chronoEcran = new Thread(new chrono());
		chronoEcran.start();
	}
	
	
	
	//****GETTERS****//
	public int getNiveau() {
		return niveau;
	}
	
	IInsanePersonModel getModel() {
		return this.modele;
	}
	
	
	
	//****SETTERS****//
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public void setModel(IInsanePersonModel modele) {
		this.modele = modele;
	}
	
	
	
	//****METHODES****//
	public void afficher() throws Exception {
		if(niveau == 1) {
			road = new Road("../Images/map1.txt");
		}
		if(niveau == 2) {
			road = new Road("../Images/map2.txt");
		}
		if(niveau == 3) {
			road = new Road("../Images/map3.txt");
		}
		if(niveau == 4) {
			road = new Road("../Images/map4.txt");
		}
		if(niveau == 5) {
			road = new Road("../Images/map5.txt");
		}
		
		JFrame fenetre = new JFrame("JKNJ");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1920, 1080);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		//Instantite scene objet
		scene = new InsanePersonView(this, road);
		scene.repaint();
		fenetre.setContentPane(scene);
		fenetre.setFocusable(true);
		fenetre.addKeyListener(scene);
		fenetre.requestFocusInWindow();
		fenetre.setVisible(true);
	}

	public void displayMessage(String message) {
		
	}

	
	public void actualiser() {
		this.repaint();
	}
}	
