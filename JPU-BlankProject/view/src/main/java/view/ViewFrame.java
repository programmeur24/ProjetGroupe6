package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;

/**
 * The Entity class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

class ViewFrame extends JFrame implements KeyListener {

	/** The model. */
	private IModel model;
	/** The controller. */
	private IController controller;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -697358409737458175L;

	/** serial version in place */
	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	/**
	 * 
	 * @param model
	 * @param gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	/**
	 * 
	 * @param model
	 * @param title
	 * @throws HeadlessException
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * 
	 * @param model
	 * @param title
	 * @param gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/** Gets the controller */
	/** return the controller*/
	
	private IController getController() {
		return this.controller;
	}

	/** sets our controller and parameter*/
	
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**gets the model and return it */
	
	protected IModel getModel() {
		return this.model;
	}

	/** sets the model and parameter */
	
	private void setModel(final IModel model) {
		this.model = model;
	}

	/** build the ViewFrame and parameter */
	
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		ViewPanel vp = new ViewPanel(this);
		this.setTitle("Boulder Dash - Group 7");
		this.setContentPane(vp);
		this.setSize(640,740);
		this.setLocationRelativeTo(null);
	}

	/** print the message */
	
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
 

	public void keyTyped(final KeyEvent e) {

	}

	
	public void keyPressed(final KeyEvent e) {
		
	}

	
	public void keyReleased(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode())); 
	}
}

