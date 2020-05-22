package view;

import java.awt.Rectangle;

import javax.swing.JPanel;

import java.awt.*;


public class InsanePersonView<IPerson, IRoad> extends JPanel implements IIsanePersonView  {
	
	private static int RoadView=50;
	private static int Square=50;
	private Rectangle closeView;
	private int view;
	private IRoad road;
	private IPerson hero;
	private IPerson monstre;
	public InsanePersonView(IRoad road, IPerson hero, IPerson monstre) {
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());

	}
	public void displayMessage(String message) {
	}
	public void run() {}
}
