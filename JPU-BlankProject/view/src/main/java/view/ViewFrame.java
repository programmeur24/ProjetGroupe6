package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;


class ViewFrame extends JFrame implements KeyListener {

	/** The model. */
	private IModel model;
	/** The controller. */
	private IController controller;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -697358409737458175L;


	
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}


	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	private IController getController() {
		return this.controller;
	}

	protected void setController(final IController controller) {
		this.controller = controller;
	}


	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}


	
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		ViewPanel vp = new ViewPanel(this);
		this.setTitle("Boulder Dash - Group 5");
		this.setContentPane(vp);
		this.setSize(640,740);
		this.setLocationRelativeTo(null);
	}

	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
 

	public void keyTyped(final KeyEvent e) {

	}
/
	public void keyPressed(final KeyEvent e) {
		
	}

	public void keyReleased(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode())); 
	}
}
