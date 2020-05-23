package view;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


import Group.GroupElementFactory;
import Personnage.Hero;
import Personnage.Monstre;
import Personnage.Personnage;
import model.Road;

import java.awt.*;


public class InsanePersonView extends JPanel  implements Observer, KeyListener {
	
	private static int RoadView=50;
	private static int Square=50;
	private Rectangle closeView;
	private int view;
	private Road road;
	private static Hero hero;
	private Monstre monstre;
	private GroupElementFactory ge;
	private Personnage personnage;
	private int k, j;
	
	public InsanePersonView(final ViewFrame viewFrame, Road road) throws Exception {
		this.road = road;
		this.setFocusable(true);
		this.hero = new Hero(32, 32, road);
		//viewFrame.getModel().getObservable().addObserver(this);
		
	}
	
	public void displayMessage(String message) {
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		System.out.println(road.getElementRoadXY(1, 1).getCorrespondence().getCharacterImage());
		//g2.drawImage(this.road.getElementRoadXY(6, 6).getImage(), 50, 50, null);
		int a = -1, b = -31, c = -31;
		for (int x = 0; x < this.getRoad().getWidth(); x++) {
			a++;
			c = c + 31;
			b = -31;
			for (int y = 0; y < this.getRoad().getHeight(); y++) {
				if(x == a) {
					b = b + 31;
					g2.drawImage(this.road.getElementRoadXY(x, y).getImage(), x + c, y + b, null);
				}
			}
		}
		g2.drawImage(this.hero.travaille(), hero.getX(), hero.getY(), null);
		//g2.drawImage(this.road.getElementRoadXY(1, 1).getImage(), 32, 0, null);
	}
	
	
	//****GETTERS***//
	public static int getRoadView() {
		return RoadView;
	}
	public static int getSquare() {
		return Square;
	}
	public Rectangle getCloseView() {
		return closeView;
	}
	public int getView() {
		return view;
	}
	public Road getRoad() {
		return road;
	}
	public Hero getHero() {
		return hero;
	}
	public Monstre getMonstre() {
		return monstre;
	}
	public int getK() {
		return getHero().getX();
	}
	
	public int getj() {
		return getHero().getY();
	}
	
	
	
	//****SETTERS****//
	public void setK(int k) {
		getHero().setX(k);
	}
	
	public void setj(int j) {
		getHero().setY(j);
	}
	
	
	private void setRoad(final Road road) throws IOException {
		this.road = road;
		for (int x = 0; x < this.getRoad().getWidth(); x++) {
			for (int y = 0; y < this.getRoad().getHeight(); y++) {
				this.getRoad().getElementRoadXY(x, y).getCorrespondence().loadImage();
			}
		}
	}

	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
		
	}

	public void keyTyped(KeyEvent e) {
		
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Je passe ici");
			this.getHero().setX(this.getHero().getX() + 32);
			try {
				Thread.sleep(2);
				repaint();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Je passe ici");
			this.getHero().setX(this.getHero().getX() - 32);
			try {
				Thread.sleep(2);
				repaint();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("Je passe ici");
			this.getHero().setY(this.getHero().getY() - 32);
			try {
				Thread.sleep(2);
				repaint();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Je passe ici");
			this.getHero().setY(this.getHero().getY() + 32);
			try {
				Thread.sleep(2);
				repaint();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("Je passe ici");
		this.getHero().setY(this.getHero().getY());
		try {
			Thread.sleep(2);
			repaint();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
