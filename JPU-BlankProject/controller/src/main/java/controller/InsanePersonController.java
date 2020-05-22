package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.IInsanePersonModel;
import model.IRoad;
import model.Road;
//import view.IKeyboard;

public class InsanePersonController extends JPanel implements IInsanePersonController{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4791129009890300612L;
	private int speed = 200;
	private IInsanePersonModel model;
	//private IKeyboard key;
	private IRoad road;
	
	
	
	public InsanePersonController() throws Exception {
		this.road = new Road("map1.txt");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.road.getElementRoadXY(0, 0).getImage(), 1, 1, null);
		/*for (int x = 0; x < this.getRoad().getWidth(); x++) {
			for (int y = 0; y < this.getRoad().getHeight(); y++) {
				g2.drawImage(this.road.getElementRoadXY(x, y).getImage(), x, y, null);
			}
		}*/
		
	}

	public IRoad getRoad() {
		return road;
	}

	public void setRoad(IRoad road) {
		this.road = road;
	}
	

}
